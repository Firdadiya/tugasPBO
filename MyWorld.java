import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ruuto ruuto = new ruuto();
        addObject(ruuto,47,28);
        batu batu = new batu();
        addObject(batu,191,31);
        batu batu2 = new batu();
        addObject(batu2,105,104);
        batu batu3 = new batu();
        addObject(batu3,159,166);
        batu batu4 = new batu();
        addObject(batu4,114,226);
        batu batu5 = new batu();
        addObject(batu5,155,305);
        batu batu6 = new batu();
        addObject(batu6,49,270);
        batu batu7 = new batu();
        addObject(batu7,47,361);
        batu batu8 = new batu();
        addObject(batu8,149,362);
        batu batu9 = new batu();
        addObject(batu9,240,81);
        batu batu10 = new batu();
        addObject(batu10,221,202);
        batu batu11 = new batu();
        addObject(batu11,309,239);
        batu batu12 = new batu();
        addObject(batu12,374,166);
        batu batu13 = new batu();
        addObject(batu13,412,90);
        batu batu14 = new batu();
        addObject(batu14,483,151);
        batu batu15 = new batu();
        addObject(batu15,493,232);
        batu batu16 = new batu();
        addObject(batu16,479,302);
        batu batu17 = new batu();
        addObject(batu17,241,329);
        batu batu18 = new batu();
        addObject(batu18,350,373);
        batu5.setLocation(153,296);
        batu5.setLocation(301,116);
        batu5.setLocation(574,22);
        batu4.setLocation(283,34);
        batu17.setLocation(258,359);
        batu8.setLocation(157,385);
        batu7.setLocation(26,377);
        batu17.setLocation(213,339);
        batu6.setLocation(94,306);
        batu batu19 = new batu();
        addObject(batu19,96,228);
        batu19.setLocation(61,231);
        batu6.setLocation(87,278);
        batu19.setLocation(27,223);
        batu6.setLocation(81,278);
        batu2.setLocation(80,121);
        batu3.setLocation(154,157);
        batu17.setLocation(255,330);
        batu12.setLocation(362,164);
        batu11.setLocation(298,233);
        removeObject(batu11);
        removeObject(batu10);
        removeObject(batu12);
        batu3.setLocation(374,262);
        batu2.setLocation(363,169);
        batu6.setLocation(333,75);
        batu9.setLocation(486,56);
        batu9.setLocation(486,56);
        batu9.setLocation(563,94);
        batu14.setLocation(574,156);
        batu9.setLocation(572,87);
        batu15.setLocation(566,274);
        batu14.setLocation(569,178);
        batu16.setLocation(465,282);
        batu3.setLocation(476,194);
        batu13.setLocation(474,102);
        batu6.setLocation(478,22);
        batu4.setLocation(382,42);
        batu.setLocation(392,117);
        batu.setLocation(384,103);
        batu2.setLocation(394,217);
        batu16.setLocation(471,291);
        batu18.setLocation(376,298);
        batu18.setLocation(401,286);
        batu17.setLocation(575,358);
        batu8.setLocation(486,353);
        batu7.setLocation(379,362);
        batu19.setLocation(313,285);
        addObject(batu12,234,185);
        batu batu20 = new batu();
        addObject(batu20,298,142);
        batu batu21 = new batu();
        addObject(batu21,343,111);
        removeObject(batu21);
        batu12.setLocation(232,177);
        batu10.setLocation(258,228);
        batu20.setLocation(304,125);
        batu12.setLocation(310,34);
        batu12.setLocation(304,29);
        batu20.setLocation(294,123);
        batu10.setLocation(267,357);
        batu19.setLocation(276,272);
        batu11.setLocation(209,194);
        batu19.setLocation(312,278);
        batu11.setLocation(249,212);
        batu20.setLocation(240,97);
        batu12.setLocation(268,20);
        batu2.setLocation(169,297);
        batu.setLocation(359,173);
        ruuto.setLocation(39,182);
        batu13.setLocation(180,203);
        batu13.setLocation(99,364);
        batu13.setLocation(46,354);
        batu2.setLocation(155,310);
        removeObject(batu2);
        removeObject(batu10);
        removeObject(batu18);
        batu19.setLocation(440,121);
        removeObject(batu19);
        removeObject(batu16);
        batu14.setLocation(398,100);
        batu.setLocation(340,300);
        batu11.setLocation(282,283);
        batu13.setLocation(303,162);
        batu.setLocation(392,218);
        ruuto.setLocation(-132,112);
        ruuto.setLocation(43,206);
        batu13.setLocation(272,191);
        batu11.setLocation(251,275);
        batu12.setLocation(287,74);
        removeObject(batu12);
        batu20.setLocation(191,49);
        batu14.setLocation(329,101);
        batu6.setLocation(475,121);
        removeObject(batu9);
        batu5.setLocation(563,44);
        batu15.setLocation(534,276);
        batu7.setLocation(260,273);
        batu7.setLocation(327,366);
        batu8.setLocation(447,347);
        removeObject(batu15);
        batu3.setLocation(513,247);
        batu3.setLocation(543,244);
        batu.setLocation(419,211);
        batu13.setLocation(333,179);
    }
}
