/**
 * LeetCode 49. 字母异位词分组
 * 给你一个字符串数组，请你将所有字母异位词组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词是由重新排列源单词的所有字母得到的一个新单词。
 */
public class No49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key: 排序后的字符串，value: 该字母异位词分组的单词列表
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 将字符串转化为字符数组，排序，再转回字符串作为键
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // 如果 key 不存在则创建新列表，然后添加原字符串
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        // 返回 map 中所有分组的列表
        return new ArrayList<>(map.values());
    }
}