package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.model.ObservableObject;

import java.util.List;

/**
 * Created by nochita on 10/05/2016.
 */
public class GlobularClusterCatalog extends BaseCatalog {

    public int getQuantity() {
        return 65;
    }

    public int getName() {
        return R.string.globular_cluster;
    }

    protected String[] populate() {
        String[] data = new String[getQuantity()];

        data[0] = "NGC-00104|B-00002|Globular Cluster (Class III)|Tucana|4|0|24|6|-|0|5|0|30.9|13400|";
        data[1] = "NGC-00288|B-00005|Globular Cluster (-)|Sculptor|8.1|0|52|48|-|2|35|0|13.8|.|";
        data[2] = "NGC-00362|B-00007|Globular Cluster (-)|Tucana|6.6|1|3|12|-|22|51|0|12.9|.|";
        data[3] = "NGC-01261|B-00011|Globular Cluster (-)|Horologium|8.4|3|12|18|-|7|13|0|6.9|.|";
        data[4] = "NGC-01851|B-00032|Globular Cluster (-)|Columba|7.3|5|14|6|-|16|3|0|11|.|";
        data[5] = "NGC-01904|B-00034|Globular Cluster (Class V)|Lepus|7.7|5|23|30|-|0|33|0|9.6|42100|";
        data[6] = "NGC-02808|B-00041|Globular Cluster (-)|Carina|6.3|9|12|0|-|16|52|0|13.8|.|";
        data[7] = "NGC-03201|B-00044|Globular Cluster (-)|Vela|6.8|10|17|36|-|22|25|0|18.2|.|";
        data[8] = "NGC-04372|B-00050|Globular Cluster (-)|Musca|7.8|12|25|48|-|0|40|0|18.6|.|";
        data[9] = "NGC-04590|B-00051|Globular Cluster (Class X)|Hydra|7.8|12|38|30|-|2|45|0|12.0|33300|";
        data[10] = "NGC-04833|B-00056|Globular Cluster (-)|Musca|7.4|12|59|36|-|22|53|0|13.5|.|";
        data[11] = "NGC-05024|M-00053|Globular Cluster (Class V)|Coma Berenices|7.6|13|11|54|+|18|10|0|13.0|58000|";
        data[12] = "NGC-05139|B-00061|Globular Cluster (-)|Centaurus|3.7|13|26|48|-|23|29|0|36.3|.|";
        data[13] = "NGC-05272|M-00003|Globular Cluster (Class VI)|Canes Venaciti|6.4|13|42|12|+|4|23|0|16.2|33900|";
        data[14] = "NGC-05286|B-00064|Globular Cluster (-)|Centaurus|7.6|13|46|24|-|3|22|0|9.1|.|";
        data[15] = "NGC-05824|B-00067|Globular Cluster (-)|Lupus|9|15|4|0|-|9|4|0|6.2|.|";
        data[16] = "NGC-05897|B-00068|Globular Cluster (-)|Libra|8.6|15|17|24|-|21|1|0|12.6|.|";
        data[17] = "NGC-05904|M-00005|Globular Cluster (Class V)|Serpens|5.6|15|17|36|+|2|5|0|23.0|24500|";
        data[18] = "NGC-05927|B-00069|Globular Cluster (-)|Lupus|8.3|15|28|0|-|2|40|0|12|.|";
        data[19] = "NGC-05986|B-00070|Globular Cluster (-)|Lupus|7.1|15|46|6|-|13|47|0|9.8|.|";
        data[20] = "NGC-06093|B-00073|Globular Cluster (Class II)|Scorpius|7.2|16|17|0|-|22|59|0|10.0|32600|";
        data[21] = "NGC-06121|B-00075|Globular Cluster (Class IX)|Scorpius|5.9|16|22|36|-|2|32|0|36.0|7200|";
        data[22] = "NGC-06171|B-00079|Globular Cluster (Class X)|Ophiuchus|8.1|16|31|30|-|13|3|0|13.0|20900|";
        data[23] = "NGC-06205|M-00013|Globular Cluster (Class V)|Hercules|5.9|16|40|42|+|12|28|0|20.0|25100|";
        data[24] = "NGC-06218|B-00080|Globular Cluster (Class IX)|Ophiuchus|6.6|16|47|12|-|1|57|0|16.0|16000|";
        data[25] = "NGC-06254|B-00083|Globular Cluster (Class VII)|Ophiuchus|6.6|16|57|6|-|4|6|0|20.0|14300|";
        data[26] = "NGC-06266|B-00085|Globular Cluster (Class IV)|Ophiuchus|6.5|17|1|12|-|6|7|0|15.0|22500|";
        data[27] = "NGC-06273|B-00086|Globular Cluster (Class VIII)|Ophiuchus|6.8|17|1|36|-|2|16|0|17.0|28000|";
        data[28] = "NGC-06284|B-00087|Globular Cluster (-)|Ophiuchus|9|17|4|30|-|0|46|0|5.6|.|";
        data[29] = "NGC-06293|B-00089|Globular Cluster (-)|Ophiuchus|8.2|17|10|12|-|2|35|0|7.9|.|";
        data[30] = "NGC-06304|B-00090|Globular Cluster (-)|Ophiuchus|8.4|17|14|30|-|5|28|0|6.8|.|";
        data[31] = "NGC-06316|B-00091|Globular Cluster (-)|Ophiuchus|9|17|16|36|-|4|8|0|4.9|.|";
        data[32] = "NGC-06333|B-00092|Globular Cluster (Class VIII)|Ophiuchus|7.7|17|19|12|-|18|31|0|12.0|25800|";
        data[33] = "NGC-06341|M-00092|Globular Cluster (Class IV)|Hercules|6.4|17|17|6|+|19|8|0|14.0|26700|";
        data[34] = "NGC-06352|B-00094|Globular Cluster (-)|Ara|8.2|17|25|30|-|0|25|0|7.1|.|";
        data[35] = "NGC-06356|B-00093|Globular Cluster (-)|Ophiuchus|8.4|17|23|36|-|17|49|0|7.2|.|";
        data[36] = "NGC-06362|B-00095|Globular Cluster (-)|Ara|8.3|17|31|54|-|19|3|0|10.7|.|";
        data[37] = "NGC-06388|B-00096|Globular Cluster (-)|Scorpius|6.9|17|36|18|-|20|44|0|8.7|.|";
        data[38] = "NGC-06397|B-00098|Globular Cluster (-)|Ara|5.7|17|40|42|-|5|40|0|25.7|.|";
        data[39] = "NGC-06402|B-00097|Globular Cluster (Class VIII)|Ophiuchus|7.6|17|36|36|-|3|15|0|11.7|30300|";
        data[40] = "NGC-06441|B-00099|Globular Cluster (-)|Scorpius|7.4|17|50|12|-|13|3|0|7.8|.|";
        data[41] = "NGC-06522|B-00101|Globular Cluster (-)|Sagittarius|8.6|18|3|36|-|6|2|0|5.6|.|";
        data[42] = "NGC-06541|B-00104|Globular Cluster (-)|Corona Australis|6.6|18|8|0|-|19|42|0|13.1|.|";
        data[43] = "NGC-06544|B-00103|Globular Cluster (-)|Sagittarius|8.3|18|7|18|-|1|0|0|8.9|.|";
        data[44] = "NGC-06553|B-00105|Globular Cluster (-)|Sagittarius|8.3|18|9|18|-|1|54|0|8.1|.|";
        data[45] = "NGC-06569|B-00106|Globular Cluster (-)|Sagittarius|8.7|18|13|36|-|7|50|0|5.8|.|";
        data[46] = "NGC-06624|B-00109|Globular Cluster (-)|Sagittarius|8.3|18|23|42|-|6|22|0|5.9|.|";
        data[47] = "NGC-06626|B-00110|Globular Cluster (Class IV)|Sagittarius|6.8|18|23|30|-|0|52|0|11.2|18300|";
        data[48] = "NGC-06637|B-00112|Globular Cluster (Class V)|Sagittarius|7.6|18|31|24|-|8|21|0|9.8|29700|";
        data[49] = "NGC-06642|B-00112|Globular Cluster (-)|Sagittarius|8.8|18|31|54|-|23|29|0|4.5|.|";
        data[50] = "NGC-06652|B-00113|Globular Cluster (-)|Sagittarius|8.9|18|35|48|-|8|59|0|3.5|.|";
        data[51] = "NGC-06656|B-00114|Globular Cluster (Class VII)|Sagittarius|5.1|18|36|24|-|23|54|0|32.0|10400|";
        data[52] = "NGC-06681|B-00115|Globular Cluster (Class V)|Sagittarius|7.9|18|43|12|-|8|18|0|8.0|29300|";
        data[53] = "NGC-06712|B-00117|Globular Cluster (-)|Scutum|8.2|18|53|6|-|8|42|0|7.2|.|";
        data[54] = "NGC-06715|B-00118|Globular Cluster (Class III)|Sagittarius|7.6|18|55|6|-|6|29|0|12.0|87400|";
        data[55] = "NGC-06723|B-00119|Globular Cluster (-)|Sagittarius|7.3|18|59|36|-|12|38|0|11|.|";
        data[56] = "NGC-06752|B-00121|Globular Cluster (-)|Pavo|5.4|19|10|54|-|11|59|0|20.4|.|";
        data[57] = "NGC-06779|M-00056|Globular Cluster (Class X)|Lyra|8.3|19|15|36|+|6|11|0|8.8|32900|";
        data[58] = "NGC-06809|B-00122|Globular Cluster (Class XI)|Sagittarius|6.3|19|40|0|-|6|58|0|19|17300|";
        data[59] = "NGC-06838|M-00071|Globular Cluster (Class X)|Sagitta|8.2|19|52|48|+|18|47|0|7.2|13000|";
        data[60] = "NGC-06864|B-00124|Globular Cluster (Class I)|Sagittarius|8.5|20|6|6|-|21|55|0|6.8|67500|";
        data[61] = "NGC-06934|C-00047|Globular Cluster (-)|Delphinus|8.9|20|34|12|+|7|24|0|5.9|.|";
        data[62] = "NGC-07078|M-00015|Globular Cluster (Class IV)|Pegasus|6.2|21|30|0|+|12|10|0|18.0|33600|";
        data[63] = "NGC-07089|B-00127|Globular Cluster (Class II)|Acuario|6.5|21|32|30|+|0|49|0|12.9|37500|";
        data[64] = "NGC-07099|B-00128|Globular Cluster (Class V)|Capricornus|7.5|21|40|24|-|23|11|0|12.0|26100|";

        return data;
    }
}
