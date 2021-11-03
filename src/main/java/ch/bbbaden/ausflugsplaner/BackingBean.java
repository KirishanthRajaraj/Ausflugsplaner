/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.ausflugsplaner;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author rajar
 */
@Named(value = "backingBean")
@SessionScoped
public class BackingBean implements Serializable {

    private String wochentag;
    private String regenwetter;
    private String schule;
    private String tag;
    private String kinder;

    boolean kegeln, freibad, hallenbad, dunkelwald,
            musik, brotbackkurs, schieferbergwerk, go_kurse,
            billard, rennauto, open_air_kino, korbflechten,
            wasserfall, zoobesuch;

    public void vorschlaegeSetzen() {
        if(tag.equals("abend") || wochentag.equals("wochentag")){
            kegeln = true;
        }
        else if(regenwetter.equals("schoenesWetter") && tag.equals("tagsueber")){
            freibad = true;
        }
        else if(schule.equals("schulferien") && wochentag.equals("wochenende")){
            hallenbad = true;
        }
        else if(regenwetter.equals("schoenesWetter") && tag.equals("tagsueber")){
            dunkelwald = true;
        }
        else if(tag.equals("abend") && schule.equals("schule")){
            musik = true;
        }
        else if(wochentag.equals("wochenende") && regenwetter.equals("regenwetter")){
            brotbackkurs = true;
        }
        else if(tag.equals("tagsueber") || (wochentag.equals("wochenende") && schule.equals("schulferien"))){
            schieferbergwerk = true;
        }
        else if(wochentag.equals("wochenende") && regenwetter.equals("regenwetter")){
            go_kurse = true;
        }
        else if(kinder.equals("ohneKinder") && (tag.equals("abend") || wochentag.equals("wochenende"))){
            billard = true;
        }
        else if(kinder.equals("ohneKinder") && tag.equals("abend") && schule.equals("schulferien") && wochentag.equals("wochenende")){
            rennauto = true;
        }
        else if(regenwetter.equals("regenwetter") && (tag.equals("abend") || wochentag.equals("wochenende"))){
            open_air_kino = true;
        }
        else if(schule.equals("schulferien") && regenwetter.equals("regenwetter") && wochentag.equals("wochentag") && wochentag.equals("wochenende")){
            korbflechten = true;
        }
        else if(tag.equals("tagsueber")){
            wasserfall = true;
        }
        zoobesuch = true;
    }
    
    public String VorschlaegeAusgeben(){
        String Ausgabe = "\\nVorschläge:\\n";
        
        if(kegeln){
            Ausgabe += " Kegeln";
        }
        else if(freibad){
            Ausgabe += " Freibad";
        }
        else if(hallenbad){
            Ausgabe += " Hallenbad";
        }
        else if(dunkelwald){
            Ausgabe += " Dunkelwald";
        }
        else if(musik){
            Ausgabe += " Musik";
        }
        else if(brotbackkurs){
            Ausgabe += " Brotbackkurs";
        }
        else if(schieferbergwerk){
            Ausgabe += " Schieferbergwerk";
        }
        else if(go_kurse){
            Ausgabe += " Go Kurse";
        }
        else if(billard){
            Ausgabe += " Billard";
        }
        else if(rennauto){
            Ausgabe += " Rennauto";
        }
        else if(open_air_kino){
            Ausgabe += " Open air Kino";
        }
        else if(korbflechten){
            Ausgabe += " Korbflechten";
        }
        else if(wasserfall){
            Ausgabe += " Wasserfall";
        }
        else if(zoobesuch){
            Ausgabe += " Zoobesuch";
        }
        return Ausgabe;
    }

    public String getWochentag() {
        return wochentag;
    }

    public void setWochentag(String wochentag) {
        this.wochentag = wochentag;
    }

    public String getRegenwetter() {
        return regenwetter;
    }

    public void setRegenwetter(String regenwetter) {
        this.regenwetter = regenwetter;
    }

    public String getSchule() {
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getKinder() {
        return kinder;
    }

    public void setKinder(String kinder) {
        this.kinder = kinder;
    }

}
