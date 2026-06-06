func longestConsecutive(nums []int) int {
    if len(nums)==0{
        return 0
    }
    seqlen:=1
    sort.Ints(nums)
    seq:=1
    for i:=1;i<len(nums);i++{
        if nums[i]==nums[i-1]{
            
        }else if nums[i]==nums[i-1]+1{
            seqlen+=1
        }else{
            if seqlen>seq{
                seq=seqlen
            }
            seqlen=1
        }
    }
    if seqlen > seq {
        seq = seqlen
    }
    return seq
}
