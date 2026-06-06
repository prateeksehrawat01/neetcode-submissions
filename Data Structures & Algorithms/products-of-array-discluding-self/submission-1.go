func productExceptSelf(nums []int) []int {
    arr := make([]int,len(nums))
    total:=1
    zeroes:=0
    for _,v := range nums{
        if v==0 {
            zeroes+=1
            continue
        }else{
            total*=v
        }
        
    }
    if zeroes>=2{
        return arr
    }
    if zeroes==1{
        for i,v:= range nums{
            if v==0{
                arr[i] =  total
            }
            
        }
        return arr
    
    }
    for i,v:= range nums{
        arr[i] =  total/v
    }
    return arr
}
