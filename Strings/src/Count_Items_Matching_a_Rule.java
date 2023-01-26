//import java.util.List;
//// https://leetcode.com/problems/count-items-matching-a-rule/description/
//public class Count_Items_Matching_a_Rule {
//    public static void main(String[] args) {
//        List<List<String>> items = new List<>() {{
//            {
//                "phone", "blue", "pixel"
//            },{
//                "computer", "silver", "lenovo"
//            },{
//                "phone", "gold", "iphone"
//            }
//        }};
//        String ruleKey = "color";
//        String ruleValue = "silver";
//        System.out.println(countMatches(items,ruleKey,ruleValue));
//    }
//
//        public int countMatches(List<List<String>> item, String ruleKey, String ruleValue) {
//            int count = 0;
//            String str = "";
//            for (int i = 0; i < item.size(); i++) {
//                if(ruleKey.equals("type")){
//                    str = "";
//                    str = item.get(i).get(0);
//                    if(str.equals(ruleValue)){
//                        count++;
//                    }
//                }
//                if(ruleKey.equals("color")){
//                    str = "";
//                    str = item.get(i).get(1);
//                    if(str.equals(ruleValue)){
//                        count++;
//                    }
//                }
//                if(ruleValue.equals("name")){
//                    str = "";
//                    str = item.get(i).get(2);
//                    if(str.equals(ruleValue)){
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//}
