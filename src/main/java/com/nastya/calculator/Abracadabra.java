package com.nastya.calculator;

public class Abracadabra {
    String spell;
    int frogs;
    int dragonEyes;
    int mouseTail;

    Abracadabra(){
    }
    Abracadabra(int frogs,int dragonEyes,int mouseTail){
        this.mouseTail=mouseTail;
        this.frogs=frogs;
        this.dragonEyes=dragonEyes;
    }

enum Spell{
    Love,
    Death,
    InfinityLife,
    Unknown;
}

    public Spell spell()
    {
       if(frogs>2 && dragonEyes>=8 && mouseTail==0)
       {
           Spell spell=Spell.Love;
           return spell;
       } else if (frogs==12 && dragonEyes==8 && mouseTail==4) {
           Spell spell=Spell.Death;
           return spell;
       } else if (frogs<=1 && dragonEyes==0 && mouseTail>12) {
           Spell spell=Spell.InfinityLife;
           return spell;
       }
       else {Spell spell=Spell.Unknown;
        return spell;}
    }
}
