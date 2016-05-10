package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.model.ObservableObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nochita on 2016-05-10.
 */
public class NebulaCatalog extends BaseCatalog {

    public int getQuantity() {
        return 19;
    }

    public int getName() {
        return R.string.nebulae;
    }

    protected String[] populate() {
        String[] data = new String[getQuantity()];

        data[0] = "NGC-00246|C-00056|Nebula (Planetary)|Cetus|8|0|47|0|-|11|53|0|3.8|.|";
        data[1] = "NGC-01952|M-00001|Nebula (Supernova Remnant)|Taurus|8.4|5|33|30|+|22|1|0|6 x 4|6300|";
        data[2] = "NGC-01976|M-00042|Nebula (Diffuse Emission and Reflection)|Orion|4|5|35|24|-|5|27|0|85 x 60|1600|";
        data[3] = "NGC-01982|M-00043|Nebula (Diffuse Emission and Reflection)|Orion|9|5|34|36|-|5|16|0|20 x 15|1600|";
        data[4] = "NGC-02068|M-00078|Nebula (Diffuse Reflection)|Orion|8|5|45|42|+|0|3|0|8 x 6|1600|";
        data[5] = "NGC-03132|B-00043|Nebula (Planetary)|Vela|8|10|7|0|-|16|26|0|0.8|.|";
        data[6] = "NGC-03242|B-00045|Nebula (Planetary)|Hydra|9|10|24|48|-|18|38|0|20.8|.|";
        data[7] = "NGC-03918|N-03918|Nebula (Planetary)|Centaurus|8|11|50|18|-|9|11|0|0.2|.|";
        data[8] = "NGC-06210|N-06210|Nebula (Planetary)|Hercules|9|16|44|30|+|23|49|0|0.2|.|";
        data[9] = "NGC-06514|H-00001|Nebula (Diffuse Emission)|Sagittarius|9|18|2|18|-|23|2|0|29|5200|";
        data[10] = "NGC-06523|M-00008|Nebula (Diffuse Emission)|Sagittarius|5.8|18|2|48|-|0|23|0|90 x 40|5200|";
        data[11] = "NGC-06543|C-00006|Nebula (Planetary)|Draco|9|17|58|36|+|18|38|0|5.8|.|";
        data[12] = "NGC-06572|N-06572|Nebula (Planetary)|Ophiuchus|9|18|12|6|+|6|51|0|0.1|.|";
        data[13] = "NGC-06618|B-00108|Nebula (Diffuse Emission)|Sagittarius|6|18|19|48|-|16|11|0|46|5000|";
        data[14] = "NGC-06720|M-00057|Nebula (Planetary Tipo 4+3)|Lyra|8.8|18|52|36|+|9|2|0|1.4 x 1.0|2300|";
        data[15] = "NGC-06853|M-00027|Nebula (Planetary Tipo 3a+2)|Vulpecula|8.1|19|58|36|+|22|43|0|8.0 x 5.7|1250|";
        data[16] = "NGC-07009|B-00126|Nebula (Planetary)|Acuario|8|21|4|12|-|11|22|0|1.7|.|";
        data[17] = "NGC-07662|C-00022|Nebula (Planetary)|Andromeda|9|23|25|54|+|18|33|0|2.2|.|";
        data[18] = "SH2-00155|C-00009|Nebula (Bright)|Cepheus|8|22|55|48|+|14|37|0|50 x 30|2900|";

        return data;
    }
}
