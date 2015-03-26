__author__ = 'Short'
# !/usr/bin/py


def find_lonely_integer(arg_list):
    hashtable = {}
    for num in arg_list:
        if num not in hashtable:
            hashtable[num] = 1
        else:
            hashtable[num] = hashtable.get(num) + 1
    print min(hashtable, key=hashtable.get)

if __name__ == '__main__':
    n = input()
    # TODO: No bounds check on raw_input < n
    arg_list = map(int, raw_input().strip().split())
    find_lonely_integer(arg_list)