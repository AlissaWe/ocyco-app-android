package ibis.jufo.mytfg.de.ibis_intelligentbikeinformationsystem;

import android.app.Application;
import android.location.Location;

public class GlobalVariables extends Application {
    //The variables can be set and read from every Activity or Service!
    double sGef, sZuf, vAkt, vD, tAnk, tAnkUnt, vDMuss, vDunt, tAnkEingTime, sEing;
    Location location;

    public void setCalculationVars(double sGefIn, double sZufIn, double vAktIn, double vDIn, double tAnkIn, double tAnkUntIn, double vDMussIn, double vDuntIn) {
        sGef = sGefIn;
        sZuf = sZufIn;
        vAkt = vAktIn;
        vD = vDIn;
        tAnk = tAnkIn;
        tAnkUnt = tAnkUntIn;
        vDMuss = vDMussIn;
        vDunt = vDuntIn;
    }

    public void setLocation(Location locationIn) {
        location = locationIn;
    }

    public void setSettingVars(double tAnkEingTimeIn, double sEingIn) {
        tAnkEingTime = tAnkEingTimeIn;
        sEing = sEingIn;
    }

    public Location getLocation() {
        return location;
    }

    public double getsEing() {
        return sEing;
    }

    public double gettAnkEingTime() {
        return tAnkEingTime;
    }

    public double getsGef() {
        return sGef;
    }

    public double getsZuf() {
        return sZuf;
    }

    public double getvAkt() {
        return vAkt;
    }

    public double getvD() {
        return vD;
    }

    public double gettAnk() {
        return tAnk;
    }

    public double gettAnkUnt() {
        return tAnkUnt;
    }

    public double getvDMuss() {
        return vDMuss;
    }

    public double getvDunt() {
        return vDunt;
    }
}

