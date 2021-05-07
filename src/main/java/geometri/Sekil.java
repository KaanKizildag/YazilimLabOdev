/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

import java.util.List;

/**
 *
 * @author kaan
 */
public abstract class Sekil {

    public boolean ayni(Sekil sekil) {
        // equals metodunu kullanarak eşitlik arıyorum.
        // equals metodu override edilerek kurallar değiştirilebilir.
        return this.equals(sekil);
    }

    public boolean sekilMisin(List<Cizgi> cizgiler) {
        for(int i = 0; i < cizgiler.size() - 1; i++){
            Cizgi once = cizgiler.get(i);
            Cizgi sonra = cizgiler.get(i + 1);
            if(!sonra.equals(once)){
                return false;
            }
        }
        return true;
    }

    public abstract float alan();

}
