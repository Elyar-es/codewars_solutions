def longest_slide_down(pyramid):
    for i in range(len(pyramid)):
        t = len(pyramid) - 1 - i
        li = pyramid[t]
        li = maxList(li)
        pyramid[t-1] = sumList(li, pyramid[t-1])
    return pyramid[0][0]
def sumList(li1, li2):
    for i in range(len(li1)):
        li1[i] += li2[i]
    return li1
def maxList(li):
    newLi = []
    for i in range(len(li)-1):
        newLi.append(max(li[i], li[i+1]))
    return newLi
