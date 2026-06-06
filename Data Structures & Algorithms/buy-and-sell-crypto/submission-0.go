func maxProfit(prices []int) int {
    var min,max int=prices[0],0
    
    for _,v:= range prices{
        if v<min{
            min=v
        }else{
            if v-min>max{
                max=v-min
            }
            
        }
    }
    return max
}
