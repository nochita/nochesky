package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.model.ObservableObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nochita on 2016-04-13.
 */
public class MessierCatalog extends BaseCatalog {

    public int getQuantity() {
        return 110;
    }

    public int getName() {
        return R.string.messier;
    }

    protected String[] populate() {
        String[] data = new String[getQuantity()];

        data[0] = "M-1|NGC-01952|Nebula (Supernova Remnant)|Taurus|8.40|5|33|30|+|22|01|00|6 x 4|6300|.";
        data[1] = "M-2|NGC-07089|Globular Cluster (Class II)|Acuarius|6.50|21|32|30|+|00|49|00|12.9|37500|.";
        data[2] = "M-3|NGC-05272|Globular Cluster (Class VI)|Canes Venaciti|6.40|13|42|12|+|28|23|00|16.2|33900|.";
        data[3] = "M-4|NGC-06121|Globular Cluster (Class IX)|Scorpius|5.90|16|22|36|-|26|32|00|36.0|7200|.";
        data[4] = "M-5|NGC-05904|Globular Cluster (Class V)|Serpens|5.60|15|17|36|+|02|05|00|23.0|24500|.";
        data[5] = "M-6|NGC-06405|Open Cluster (Type e)|Scorpius|4.20|17|40|6|-|32|13|00|25.0|1600|.";
        data[6] = "M-7|NGC-06475|Open Cluster (Type e)|Scorpius|3.30|17|52|54|-|34|49|00|80.0|800|.";
        data[7] = "M-8|NGC-06523|Nebula (Diffuse Emission)|Sagittarius|5.80|18|2|48|-|24|23|00|90 x 40|5200|.";
        data[8] = "M-9|NGC-06333|Globular Cluster (Class VIII)|Ophiuchus|7.70|17|19|12|-|18|31|00|12.0|25800|.";
        data[9] = "M-10|NGC-06254|Globular Cluster (Class VII)|Ophiuchus|6.60|16|57|6|-|4|06|00|20.0|14300|.";
        data[10] = "M-11|NGC-06705|Open Cluster (Type g)|Scutum|6.30|18|51|6|-|6|16|00|14|6000|.";
        data[11] = "M-12|NGC-06218|Globular Cluster (Class IX)|Ophiuchus|6.60|16|47|12|-|1|57|00|16.0|16000|.";
        data[12] = "M-13|NGC-06205|Globular Cluster (Class V)|Hercules|5.90|16|40|42|+|36|28|00|20.0|25100|.";
        data[13] = "M-14|NGC-06402|Globular Cluster (Class VIII)|Ophiuchus|7.60|17|36|36|-|3|15|00|11.7|30300|.";
        data[14] = "M-15|NGC-07078|Globular Cluster (Class IV)|Pegasus|6.20|21|30|0|+|12|10|00|18.0|33600|.";
        data[15] = "M-16|NGC-06611|Open Cluster (Type e)|Serpens|6.00|18|17|48|-|13|47|00|35.0|7000|.";
        data[16] = "M-17|NGC-06618|Nebula (Diffuse Emission)|Sagittarius|6.00|18|19|48|-|16|11|00|46|5000|.";
        data[17] = "M-18|NGC-06613|Open Cluster (Type d)|Sagittarius|7.50|18|18|54|-|17|08|00|9|4900|.";
        data[18] = "M-19|NGC-06273|Globular Cluster (Class VIII)|Ophiuchus|6.80|17|1|36|-|26|16|00|17.0|28000|.";
        data[19] = "M-20|NGC-06514|Nebula (Diffuse Emission)|Sagittarius|9.00|18|2|18|-|23|02|00|29|5200|.";
        data[20] = "M-21|NGC-06531|Open Cluster (Type d)|Sagittarius|5.90|18|3|36|-|22|30|00|13|4250|.";
        data[21] = "M-22|NGC-06656|Globular Cluster (Class VII)|Sagittarius|5.10|18|36|24|-|23|54|00|32.0|10400|.";
        data[22] = "M-23|NGC-06494|Open Cluster (Type e)|Sagittarius|6.90|17|55|48|-|19|01|00|27.0|2150|.";
        data[23] = "M-24|M-00024|Campo Estelar (-)|Sagittarius|4.60|18|15|54|-|18|29|00|90.0|10000|.";
        data[24] = "M-25|IC-04725|Open Cluster (Type d)|Sagittarius|6.50|18|30|36|-|19|15|00|40.0|2000|.";
        data[25] = "M-26|NGC-06694|Open Cluster (Type f)|Scutum|8.00|18|45|12|-|9|24|00|15|5000|.";
        data[26] = "M-27|NGC-06853|Nebula (Planetary Type 3a+2)|Vulpecula|8.10|19|58|36|+|22|43|00|8.0 x 5.7|1250|.";
        data[27] = "M-28|NGC-06626|Globular Cluster (Class IV)|Sagittarius|6.80|18|23|30|-|24|52|00|11.2|18300|.";
        data[28] = "M-29|NGC-06913|Open Cluster (Type d)|Cygnus|6.60|20|22|54|+|38|32|00|7|4000|.";
        data[29] = "M-30|NGC-07099|Globular Cluster (Class V)|Capricornus|7.50|21|40|24|-|23|11|00|12.0|26100|.";
        data[30] = "M-31|NGC-00224|Galaxy (Spiral Type Sb)|Andromeda|3.50|0|41|42|+|41|16|00|178 x 63|2900000|.";
        data[31] = "M-32|NGC-00221|Galaxy (Elliptical Type E2)|Andromeda|8.20|0|41|42|+|40|52|00|8 x 6|2900000|.";
        data[32] = "M-33|NGC-00598|Galaxy (Spiral Type Sc)|Triangulum|5.70|1|32|54|+|30|39|00|73 x 45|3000000|.";
        data[33] = "M-34|NGC-01039|Open Cluster (Type d)|Perseus|5.50|2|42|0|+|42|47|00|35|1400|.";
        data[34] = "M-35|NGC-02168|Open Cluster (Type e)|Gemini|5.30|6|7|54|+|24|20|00|28.0|2800|.";
        data[35] = "M-36|NGC-01960|Open Cluster (Type f)|Auriga|6.30|5|36|6|+|34|08|00|12.0|4100|.";
        data[36] = "M-37|NGC-02099|Open Cluster (Type f)|Auriga|6.20|5|52|24|+|32|33|00|24.0|4400|.";
        data[37] = "M-38|NGC-01912|Open Cluster (Type e)|Auriga|7.40|5|27|42|+|35|50|00|21.0|4200|.";
        data[38] = "M-39|NGC-07092|Open Cluster (Type e)|Cygnus|4.60|21|32|12|+|48|26|00|32.0|825|.";
        data[39] = "M-40|WNC-00004|Estrella Multiple (Double)|Ursa Major|8.40|12|22|24|+|58|08|00|08|510|.";
        data[40] = "M-41|NGC-02287|Open Cluster (Type e)|Canis Major|4.60|6|47|0|-|20|44|00|38|2300|.";
        data[41] = "M-42|NGC-01976|Nebula (Diffuse Emission and Reflection)|Orion|4.00|5|35|24|-|5|27|00|85 x 60|1600|.";
        data[42] = "M-43|NGC-01982|Nebula (Diffuse Emission and Reflection)|Orion|9.00|5|34|36|-|5|16|00|20 x 15|1600|.";
        data[43] = "M-44|NGC-02632|Open Cluster (Type d)|Cancer|3.10|8|40|6|+|19|59|00|95.0|577|.";
        data[44] = "M-45|M-00045|Open Cluster (Type c)|Taurus|1.60|3|47|0|+|24|07|00|110.0|380|.";
        data[45] = "M-46|NGC-02437|Open Cluster (Type f)|Puppis|6.00|7|40|48|-|14|49|00|27.0|5400|.";
        data[46] = "M-47|NGC-02422|Open Cluster (Type d)|Puppis|5.20|7|35|36|-|14|30|00|30.0|1600|.";
        data[47] = "M-48|NGC-02548|Open Cluster (Type f)|Hydra|5.50|8|12|48|-|5|48|00|54.0|1500|.";
        data[48] = "M-49|NGC-04472|Galaxy (Elliptical Type E4)|Virgo|8.40|12|28|48|+|08|00|00|9 x 7.5|60000000|.";
        data[49] = "M-50|NGC-02323|Open Cluster (Type e)|Monoceros|5.90|7|3|12|-|8|20|00|16.0|3000|.";
        data[50] = "M-51|NGC-05194|Galaxy (Spiral Type Sc)|Canes Venaciti|8.40|13|28|54|+|47|12|00|11 x 7|37000000|.";
        data[51] = "M-52|NGC-07654|Open Cluster (Type e)|Cassiopeia|6.90|23|24|12|+|61|35|00|13|5000|.";
        data[52] = "M-53|NGC-05024|Globular Cluster (Class V)|Coma Berenices|7.60|13|11|54|+|18|10|00|13.0|58000|.";
        data[53] = "M-54|NGC-06715|Globular Cluster (Class III)|Sagittarius|7.60|18|55|6|-|30|29|00|12.0|87400|.";
        data[54] = "M-55|NGC-06809|Globular Cluster (Class XI)|Sagittarius|6.30|19|40|0|-|30|58|00|19|17300|.";
        data[55] = "M-56|NGC-06779|Globular Cluster (Class X)|Lyra|8.30|19|15|36|+|30|11|00|8.8|32900|.";
        data[56] = "M-57|NGC-06720|Nebula (Planetary Type 4+3)|Lyra|8.80|18|52|36|+|33|02|00|1.4 x 1.0|2300|.";
        data[57] = "M-58|NGC-04579|Galaxy (Barred Spiral Type SBc)|Virgo|9.70|12|36|42|+|11|49|00|5.5 x 4.5|60000000|.";
        data[58] = "M-59|NGC-04621|Galaxy (Elliptical Type E5)|Virgo|9.60|12|42|0|+|11|39|00|5 x 3.5|60000000|.";
        data[59] = "M-60|NGC-04649|Galaxy (Elliptical Type E2)|Virgo|8.80|12|42|42|+|11|33|00|7 x 6|60000000|.";
        data[60] = "M-61|NGC-04303|Galaxy (Barred Spiral Interm Type SABbc)|Virgo|9.70|12|20|54|+|04|28|00|6 x 5.5|60000000|.";
        data[61] = "M-62|NGC-06266|Globular Cluster (Class IV)|Ophiuchus|6.50|17|1|12|-|30|07|00|15.0|22500|.";
        data[62] = "M-63|NGC-05055|Galaxy (Spiral Type Sb)|Canes Venaciti|8.60|13|14|48|+|42|02|00|10 x 6|37000000|.";
        data[63] = "M-64|NGC-04826|Galaxy (Spiral Type Sb)|Coma Berenices|8.50|12|55|42|+|21|41|00|9.3 x 5.4|19000000|.";
        data[64] = "M-65|NGC-03623|Galaxy (Spiral Type Sa)|Leo|9.30|11|17|54|+|13|05|00|8 x 1.5|35000000|.";
        data[65] = "M-66|NGC-03627|Galaxy (Spiral Type Sb)|Leo|8.90|11|20|12|+|12|59|00|8 x 2.5|35000000|.";
        data[66] = "M-67|NGC-02682|Open Cluster (Type f)|Cancer|6.10|8|50|24|+|11|49|00|30.0|2700|.";
        data[67] = "M-68|NGC-04590|Globular Cluster (Class X)|Hydra|7.80|12|38|30|-|26|45|00|12.0|33300|.";
        data[68] = "M-69|NGC-06637|Globular Cluster (Class V)|Sagittarius|7.60|18|31|24|-|32|21|00|9.8|29700|.";
        data[69] = "M-70|NGC-06681|Globular Cluster (Class V)|Sagittarius|7.90|18|43|12|-|32|18|00|8.0|29300|.";
        data[70] = "M-71|NGC-06838|Globular Cluster (Class X)|Sagitta|8.20|19|52|48|+|18|47|00|7.2|13000|.";
        data[71] = "M-72|NGC-06981|Globular Cluster (Class IX)|Acuarius|9.30|20|52|30|-|12|32|00|6.6|55400|.";
        data[72] = "M-73|NGC-06994|Star Asterism|Acuarius|9.00|20|58|0|-|12|38|00|3|2000|.";
        data[73] = "M-74|NGC-00628|Galaxy (Spiral Type Sc)|Pisces|9.20|1|35|42|+|15|47|00|10.2 x 9.5|35000000|.";
        data[74] = "M-75|NGC-06864|Globular Cluster (Class I)|Sagittarius|8.50|20|6|6|-|21|55|00|6.8|67500|.";
        data[75] = "M-76|NGC-00650|Nebula (Planetary Type 3+6)|Perseus|10.10|1|42|18|+|51|34|00|2.7 x 1.8|3400|.";
        data[76] = "M-77|NGC-01068|Galaxy (Spiral Type Sb)|Cetus|8.80|2|41|42|+|00|01|00|7 x 6|60000000|.";
        data[77] = "M-78|NGC-02068|Reflection Nebula|Orion|8.00|5|45|42|+|00|03|00|8 x 6|1600|.";
        data[78] = "M-79|NGC-01904|Globular Cluster (Class V)|Lepus|7.70|5|23|30|-|24|33|00|9.6|42100|.";
        data[79] = "M-80|NGC-06093|Globular Cluster (Class II)|Scorpius|7.20|16|17|0|-|22|59|00|10.0|32600|.";
        data[80] = "M-81|NGC-03031|Galaxy (Spiral Type Sb)|Ursa Major|6.90|9|54|36|+|69|04|00|21 x 10|12000000|.";
        data[81] = "M-82|NGC-03034|Galaxy (Irregular Type Irr-II)|Ursa Major|8.40|9|54|48|+|69|41|00|9 x 4|12000000|.";
        data[82] = "M-83|NGC-05236|Galaxy (Barred Spiral Interm Type SABc)|Hydra|7.60|13|37|0|-|29|52|00|11 x 10|15000000|.";
        data[83] = "M-84|NGC-04374|Galaxy (Lenticular Type S0)|Virgo|9.10|12|25|6|+|12|53|00|5.0|60000000|.";
        data[84] = "M-85|NGC-04382|Galaxy (Lenticular Type S0)|Coma Berenices|9.10|12|25|24|+|18|11|00|7.1 x 5.2|60000000|.";
        data[85] = "M-86|NGC-04406|Galaxy (Lenticular Type S0)|Virgo|8.90|12|26|12|+|12|57|00|7.5 x 5.5|60000000|.";
        data[86] = "M-87|NGC-04486|Galaxy (Elliptical Type E1)|Virgo|8.60|12|29|48|+|12|24|00|7.2|60000000|.";
        data[87] = "M-88|NGC-04501|Galaxy (Spiral Type Sc)|Coma Berenices|9.50|12|32|0|+|14|25|00|7 x 4|60000000|.";
        data[88] = "M-89|NGC-04552|Galaxy (Elliptical Type E0)|Virgo|9.80|12|34|42|+|12|33|00|4.2|60000000|.";
        data[89] = "M-90|NGC-04569|Galaxy (Spiral Type Sb)|Virgo|9.50|12|35|48|+|13|10|00|9.5 x 4.5|60000000|.";
        data[90] = "M-91|NGC-04548|Galaxy (Barred Spiral Type SBb)|Coma Berenices|10.20|12|35|24|+|14|30|00|5.4 x 4.4|60000000|.";
        data[91] = "M-92|NGC-06341|Globular Cluster (Class IV)|Hercules|6.40|17|17|6|+|43|08|00|14.0|26700|.";
        data[92] = "M-93|NGC-02447|Open Cluster (Type g)|Puppis|6.00|7|43|36|-|23|52|00|22.0|3600|.";
        data[93] = "M-94|NGC-04736|Galaxy (Spiral Type Sb)|Canes Venaciti|8.20|12|49|54|+|41|07|00|7 x 3|14500000|.";
        data[94] = "M-95|NGC-03351|Galaxy (Barred Spiral Type SBb)|Leo|9.70|10|44|0|+|11|42|00|4.4 x 3.3|38000000|.";
        data[95] = "M-96|NGC-03368|Galaxy (Spiral Type Sa)|Leo|9.20|10|45|48|+|11|49|00|6 x 4|38000000|.";
        data[96] = "M-97|NGC-03587|Nebula (Planetary Type 3a)|Ursa Major|9.90|11|13|48|+|55|01|00|3.4 x 3.3|2600|.";
        data[97] = "M-98|NGC-04192|Galaxy (Spiral Type Sb)|Coma Berenices|10.10|12|12|48|+|14|54|00|9.5 x 3.2|60000000|.";
        data[98] = "M-99|NGC-04254|Galaxy (Spiral Type Sc)|Coma Berenices|9.80|12|17|48|+|14|25|00|5.4 x 4.8|60000000|.";
        data[99] = "M-100|NGC-04321|Galaxy (Spiral Type Sc)|Coma Berenices|9.40|12|21|54|+|15|49|00|7 x 6|60000000|.";
        data[100] = "M-101|NGC-05457|Galaxy (Spiral Type Sc)|Ursa Major|7.70|14|3|12|+|54|21|00|26.9|27000000|.";
        data[101] = "M-102|NGC-05866|Galaxy (Lenticular Type S0)|Draco|9.90|15|5|30|+|55|46|00|5.2 x 2.3|40000000|.";
        data[102] = "M-103|NGC-00581|Open Cluster (Type d)|Cassiopeia|7.40|1|33|12|+|60|42|00|6.0|8500|.";
        data[103] = "M-104|NGC-04594|Galaxy (Spiral Type Sa)|Virgo|8.30|12|40|0|-|11|37|00|9 x 4|50000000|.";
        data[104] = "M-105|NGC-03379|Galaxy (Elliptical Type E1)|Leo|9.30|10|48|0|+|12|35|00|4.5|38000000|.";
        data[105] = "M-106|NGC-04258|Galaxy (Spiral Type Sb)|Canes Venaciti|8.30|12|19|0|+|47|18|00|19 x 8|25000000|.";
        data[106] = "M-107|NGC-06171|Globular Cluster (Class X)|Ophiuchus|8.10|16|31|30|-|13|03|00|13.0|20900|.";
        data[107] = "M-108|NGC-03556|Galaxy (Spiral Type Sc)|Ursa Major|10.10|11|10|30|+|55|40|00|8 x 1|45000000|.";
        data[108] = "M-109|NGC-03992|Galaxy (Barred Spiral Type SBc)|Ursa Major|9.80|11|56|36|+|53|23|00|7 x 4|55000000|.";
        data[109] = "M-110|NGC-00205|Galaxy (Elliptical Type E6)|Andromeda|8.50|0|40|24|+|41|41|00|17 x 10|2900000|.";

        return data;
    }
}
