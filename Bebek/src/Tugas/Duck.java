package Tugas;

import suaraBebek.Sound;
import Terbang.FlyBehaviour;
import Bertahan.BertahanBehaviour;
import Menyerang.AttackBehaviour;


public class Duck {
    
    private FlyBehaviour flyBehaviour;
    private Sound sound;
    private AttackBehaviour attackBehaviour;
    private BertahanBehaviour bertahanBehaviour;
   
    
    public Duck(FlyBehaviour flyBehaviour, Sound sound, AttackBehaviour attackBehaviour, BertahanBehaviour bertahanBehaviour ){
        this.flyBehaviour=flyBehaviour;
        this.sound=sound;
        this.attackBehaviour=attackBehaviour;
        this.bertahanBehaviour=bertahanBehaviour;
        
    }
    
    public void getAttack(){
        attackBehaviour.attack();
    }
    
     public void getSound(){
        sound.sound();
    }
     
      public void getFly(){
        flyBehaviour.fly();
    }
      
     public void getBertahan(){
         bertahanBehaviour.bertahan();
     }
 
    
}
