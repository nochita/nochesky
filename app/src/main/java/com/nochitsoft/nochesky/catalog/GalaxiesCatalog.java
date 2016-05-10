package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.R;

/**
 * Created by nochita on 10/05/2016.
 */
public class GalaxiesCatalog extends BaseCatalog {

    public int getQuantity() {
        return 36;
    }

    public int getName() {
        return R.string.galaxies;
    }

    protected String[] populate() {
        String[] data = new String[getQuantity()];

        data[0] = "IC-00342|C-00005|Galaxy (-)|Camelopardis|9|3|46|48|+|20|6|0|17.8|.|";
        data[1] = "IC-04895|I-04895|Galaxy (-)|Sagittarius|8|19|45|0|-|14|48|0|10|.|";
        data[2] = "NGC-00055|B-00001|Galaxy (-)|Sculptor|8|0|14|54|-|15|11|0|32.4|.|";
        data[3] = "NGC-00205|H-00016|Galaxy (Elliptical Type E6)|Andromeda|8.5|0|40|24|+|17|41|0|17 x 10|2900000|";
        data[4] = "NGC-00221|M-00032|Galaxy (Elliptical Type E2)|Andromeda|8.2|0|41|42|+|16|52|0|8 x 6|2900000|";
        data[5] = "NGC-00224|M-00031|Galaxy (Spiral Type Sb)|Andromeda|3.5|0|41|42|+|17|16|0|178 x 63|2900000|";
        data[6] = "NGC-00247|B-00003|Galaxy (-)|Cetus|8.9|0|47|6|-|20|46|0|20|.|";
        data[7] = "NGC-00253|B-00004|Galaxy (-)|Sculptor|7.1|0|47|36|-|1|17|0|25.1|.|";
        data[8] = "NGC-00300|B-00006|Galaxy (-)|Sculptor|9|0|54|54|-|13|41|0|20|.|";
        data[9] = "NGC-00598|H-00002|Galaxy (Spiral Type Sc)|Triangulum|5.7|1|32|54|+|6|39|0|73 x 45|3000000|";
        data[10] = "NGC-01068|B-00009|Galaxy (Spiral Type Sb)|Cetus|8.8|2|41|42|+|0|1|0|7 x 6|60000000|";
        data[11] = "NGC-01291|B-00012|Galaxy (-)|Eridanus|8.5|3|17|18|-|17|8|0|10.5|.|";
        data[12] = "NGC-01313|B-00013|Galaxy (-)|Reticulum|9|3|18|18|-|18|30|0|8.5|.|";
        data[13] = "NGC-01316|B-00014|Galaxy (-)|Fornax|8.9|3|22|42|-|13|12|0|7.1|.|";
        data[14] = "NGC-02403|C-00007|Galaxy (-)|Camelopardis|8.4|7|36|54|+|17|36|0|17.8|.|";
        data[15] = "NGC-02903|H-00141|Galaxy (-)|Leo|8.9|9|32|12|+|21|30|0|12.6|.|";
        data[16] = "NGC-03031|M-00081|Galaxy (Spiral Type Sb)|Ursa Major|6.9|9|54|36|+|21|4|0|21 x 10|12000000|";
        data[17] = "NGC-03034|H-00007|Galaxy (Irregular Type Irr-II)|Ursa Major|8.4|9|54|48|+|21|41|0|9 x 4|12000000|";
        data[18] = "NGC-03521|H-00174|Galaxy (-)|Leo|8.9|11|5|48|+|0|2|0|9.5|.|";
        data[19] = "NGC-03627|M-00066|Galaxy (Spiral Type Sb)|Leo|8.9|11|20|12|+|12|59|0|8 x 2.5|35000000|";
        data[20] = "NGC-04258|H-00012|Galaxy (Spiral Type Sb)|Canes Venaciti|8.3|12|19|0|+|23|18|0|19 x 8|25000000|";
        data[21] = "NGC-04406|M-00086|Galaxy (Lenticular Type S0)|Virgo|8.9|12|26|12|+|12|57|0|7.5 x 5.5|60000000|";
        data[22] = "NGC-04472|M-00049|Galaxy (Elliptical Type E4)|Virgo|8.4|12|28|48|+|8|0|0|9 x 7.5|60000000|";
        data[23] = "NGC-04486|M-00087|Galaxy (Elliptical Type E1)|Virgo|8.6|12|29|48|+|12|24|0|7.2|60000000|";
        data[24] = "NGC-04594|B-00052|Galaxy (Spiral Type Sa)|Virgo|8.3|12|40|0|-|11|37|0|9 x 4|50000000|";
        data[25] = "NGC-04649|M-00060|Galaxy (Elliptical Type E2)|Virgo|8.8|12|42|42|+|11|33|0|7 x 6|60000000|";
        data[26] = "NGC-04736|M-00094|Galaxy (Spiral Type Sb)|Canes Venaciti|8.2|12|49|54|+|17|7|0|7 x 3|14500000|";
        data[27] = "NGC-04826|M-00064|Galaxy (Spiral Type Sb)|Coma Berenices|8.5|12|55|42|+|21|41|0|9.3 x 5.4|19000000|";
        data[28] = "NGC-04945|B-00057|Galaxy (-)|Centaurus|9|13|5|24|-|1|28|0|20|.|";
        data[29] = "NGC-05055|M-00063|Galaxy (Spiral Type Sb)|Canes Venaciti|8.6|13|14|48|+|18|2|0|10 x 6|37000000|";
        data[30] = "NGC-05128|B-00060|Galaxy (-)|Centaurus|7|13|25|30|-|19|1|0|18.2|.|";
        data[31] = "NGC-05194|M-00051|Galaxy (Spiral Type Sc)|Canes Venaciti|8.4|13|28|54|+|23|12|0|11 x 7|37000000|";
        data[32] = "NGC-05236|B-00063|Galaxy (Spiral Interm Barrada Type SABc)|Hydra|7.6|13|37|0|-|5|52|0|11 x 10|15000000|";
        data[33] = "NGC-05457|M-00101|Galaxy (Spiral Type Sc)|Ursa Major|7.7|14|3|12|+|6|21|0|26.9|27000000|";
        data[34] = "NGC-06744|B-00120|Galaxy (-)|Pavo|9|19|9|48|-|15|51|0|15.5|.|";
        data[35] = "NGC-06946|C-00012|Galaxy (-)|Cepheus|8.9|20|34|48|+|12|9|0|11|.|";

        return  data;
    }
}
