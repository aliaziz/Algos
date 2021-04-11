import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoPrefix {
    List<String> words = Arrays.asList(
            "hgiiccfchbeadgebc",
                "biiga",
                     "edchgb",
                     "ccfdbeajaeid",
                     "ijgbeecjbj",
                     "bcfbbacfbfcfbhcbfjafibfhffac",
                     "ebechbfhfcijcjbcehbgbdgbh",
                     "ijbfifdbfifaidje",
                     "acgffegiihcddcdfjhhgadfjb",
                     "ggbdfdhaffhghbdh",
                     "dcjaichjejgheiaie",
                     "d",
                     "jeedfch",
                     "ahabicdffbedcbdeceed",
                     "fehgdfhdiffhegafaaaiijceijdgbb",
                     "beieebbjdgdhfjhj",
                     "ehg",
                     "fdhiibhcbecddgijdb",
                     "jgcgafgjjbg",
                     "c",
                     "fiedahb",
                     "bhfhjgcdbjdcjjhaebejaecdheh",
                     "gbfbbhdaecdjaebadcggbhbchfjg",
                     "jdjejjg",
                     "dbeedfdjaghbhgdhcedcj",
                     "decjacchhaciafafdgha",
                     "a",
                     "hcfibighgfggefghjh",
                     "ccgcgjgaghj",
                     "bfhjgehecgjchcgj",
                     "bjbhcjcbbhf",
                     "daheaggjgfdcjehidfaedjfccdafg",
                     "efejicdecgfieef",
                     "ciidfbibegfca",
                     "jfhcdhbagchjdadcfahdii",
                     "i",
                     "abjfjgaghbc",
                     "bddeejeeedjdcfcjcieceieaei",
                     "cijdgbddbceheaeececeeiebafgi",
                     "haejgebjfcfgjfifhihdbddbacefd",
                     "bhhjbhchdiffb",
                     "jbbdhcbgdefifhafhf",
                     "ajhdeahcjjfie",
                     "idjajdjaebfhhaacecb",
                     "bhiehhcggjai",
                     "bjjfjhiice",
                     "aif",
                     "gbbfjedbhhhjfegeeieig",
                     "fefdhdaiadefifjhedaieaefc",
                     "hgaejbhdebaacbgbgfbbcad",
                     "heghcb",
                     "eggadagajjgjgaihjdigihfhfbijbh",
                     "jadeehcciedcbjhdeca",
                     "ghgbhhjjgghgie",
                     "ibhihfaeeihdffjgddcj",
                     "hiedaegjcdai",
                     "bjcdcafgfjdejgiafdhfed",
                     "fgdgjaihdjaeefejbbijdbfabeie",
                     "aeefgiehgjbfgidcedjhfdaaeigj",
                     "bhbiaeihhdafgaciecb",
                     "igicjdajjdegbceibgebedghihihh",
                     "baeeeehcbffd",
                     "ajfbfhhecgaghgfdadbfbb",
                     "ahgaccehbgajcdfjihicihhc",
                     "bbjhih",
                     "a",
                     "cdfcdejacaicgibghgddd",
                     "afeffehfcfiefhcagg",
                     "ajhebffeh",
                     "e",
                     "hhahehjfgcj",
                     "ageaccdcbbcfidjfc",
                     "gfcjahbbhcbggadcaebae",
                     "gi",
                     "edheggceegiedghhdfgabgcd",
                     "hejdjjbfacggdccgahiai",
                     "ffgeiadgjfgecdbaebagij",
                     "dgaiahge",
                     "hdbaifh",
                     "gbhccajcdebcig",
                     "ejdcbbeiiebjcagfhjfdahbif",
                     "g",
                     "ededbjaaigdhb",
                     "ahhhcibdjhidbgefggdjebfcf",
                     "bdigjaehfchebiedajcjdh",
                     "fjehjgbdbaiifi",
                     "fbgigbdcbcgffdicfcidfdafghajc",
                     "ccajeeijhhb",
                     "gaaagfacgiddfahejhbgdfcfbfeedh",
                     "gdajaigfbjcdegeidgaccjfi",
                     "fghechfchjbaebcghfcfbdicgaic",
                     "cfhigaciaehacdjhfcgajgbhhgj",
                     "edhjdbdjccbfihiaddij",
                     "cbbhagjbcadegicgifgghai",
                     "hgdcdhieji",
                     "fbifgbhdhagch",
                     "cbgcdjea",
                     "dggjafcajhbbbaja",
                     "bejihed",
                     "eeahhcggaaidifdigcfjbficcfhjj");
    public static void noPrefix(List<String> words) {
        //Create a trie. It holds our characters.
        //For each word, traverse through the trie, and on each iteration we
        // build  a word using those characters,
        // we have so far encountered. Then check if that word exists in the list.
        // Search for word in trie. For each node, check if that prefix makes a word.
        // If it does, return BAD SET, with collection of characters at that point.
        Set<String> wordSet = new HashSet<>(), prefixSet = new HashSet<>();
        for(String word : words) {
            if(prefixSet.contains(word)) {
                System.out.println("BAD SET" + "\n" + word);
                return;
            }
            String prefix = "";
            for(int i = 0; i < word.length(); i++) {
                if(wordSet.contains(prefix + word.charAt(i))) {
                    System.out.println("BAD SET" + "\n" + word);
                    return;
                }
                prefix += word.charAt(i);
                prefixSet.add(prefix);
            }
            wordSet.add(word);
        }
        System.out.println("GOOD SET");
    }
}
