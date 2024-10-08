## 객체지향프로그래밍 강의 Battle GUI 과제
### 1. 프로그램의 목적과 동작 시나리오
1.1 프로그램 목적
      
  좋아하는 영국 락밴드 오아시스와 블러를 이용해서 1대1 턴제 형식 배틀 게임을 구현한다.
    
  수업에 시간에 배운 내용을 최대한 활용하여 객체지향적인 코드를 짤 수 있도록 한다. 

---

1.2 동작 시나리오
   ![image](https://github.com/user-attachments/assets/0205001d-d67e-4879-b81e-21c2c9cbd4f7)
   ![image](https://github.com/user-attachments/assets/7ea9b254-c52d-4e88-8e8c-1513096cba83)

  - 오아시스 팀, 블러 팀으로 나뉜다.
    
  - 처음 오아시스 팀에서 랜덤하게 1명, 블러 팀에서 랜덤하게 1명의 플레이어를 뽑고 1대1 대결을 한다. 
    
  - 처음 공격할 사람은 랜덤하게 정한다. 턴 제 형식으로 진행되어 번갈아 가면서 공격한다. 
    
  - 플레이어는 일반 공격, 무기 공격, 스트레스 해소 중 한 가지 행동을 할 수 있다. 
    
  - 일반 공격은 플레이어의 power만큼 상대방의 hp를 깎는다. 
    
  - 무기 공격은 플레이어의 power + 무기의 power (확률적 적용) + 무기의 추가 능력 (확률적 적용)하여 상대방의 hp를 깎는다. 
    
  - 무기의 공격이 실패하면 무기의 추가 능력은 무조건 발동하지 않는다.
  
  - 플레이어는 일반공격 또는 무기 공격시마다 스트레스가 1 증가한다. 
    
  - 스트레스가 10 이상이 되면 플레이어는 그 어떤 공격도 할 수 없고 반드시 스트레스 해소를 해야지만 다음 턴으로 넘어간다. 
    
  - 상대방의 hp가 0이 되면 해당 대결을 종료되고 살아남은 플레이어의 hp와 스트레스는 그대로 유지된다. 
    
  - 또 다시 각 팀에서 한 명씩 뽑고 어느 한 팀의 플레이어가 단 한명도 없을 때까지 진행한다. 
    
  - 시작 화면 (두 명 뽑기) -> 1대1 대결 화면 -> 시작 화면 -> 1대1 대결 -> .... -> 승리 화면

---
### 2. Player와 Weapon의 클래스 다이어그램
   2.1 Player
![image](https://github.com/user-attachments/assets/e4b7e499-a1ad-4438-b07b-00d641246e6e)
![image](https://github.com/user-attachments/assets/55090a77-9e0f-41e1-95cb-7a0a4d01b0d1)

   2.2 Weapon
![image](https://github.com/user-attachments/assets/e0f2394e-b515-431d-8446-6c7f09201fda)

---

### 3. 시연 영상

https://github.com/user-attachments/assets/99a25048-77e1-40fe-aa1b-f5a4dc3fc919




