if __name__ == '__main__':
     
    lower, upper, i, j, flag = 0, 0, 0, 0, 0
 
    print("Enter lower bound of the interval:",
                                      end = "")
    lower = int(input()) 
    print(lower)
     
    print("Enter upper bound of the interval:",
                                      end = "")
    upper = int(input()) 
    print(upper)
     
    
    print("Prime numbers between", lower, "and",
                        upper, "are:", end = "")
 
    for i in range(lower, upper + 1):
        if (i == 1):
            continue
        flag = 1 
        for j in range(2, i // 2 + 1):
            if (i % j == 0):
                flag = 0
                break  
        if (flag == 1):
            print(i, end = " ")