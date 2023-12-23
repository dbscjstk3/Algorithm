num_list = [int(input()) for _ in range(5)]
num_list.sort()
print(sum(num_list)//len(num_list))
print(num_list[2])