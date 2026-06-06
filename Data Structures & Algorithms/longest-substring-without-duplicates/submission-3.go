func lengthOfLongestSubstring(s string)  int {
   mp := make(map[byte]int)
    l, res := 0, 0

    for r := 0; r < len(s); r++ {
        for {
            if _, found := mp[s[r]]; !found {
                break
            }
            delete(mp, s[l])
            l++
        }
        mp[s[r]] = r
        if r - l + 1 > res {
            res = r - l + 1
        }
    }
    return res
}
