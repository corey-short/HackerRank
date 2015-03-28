__author__ = 'Short'

# Enter your code here. Read input from STDIN. Print output to STDOUT


def u_tree(num_cycles, height):
    if num_cycles == 0:
        return height
    if num_cycles % 2 == 1:
        height = 2 * u_tree(num_cycles - 1, height)
    else:
        height = 1 + u_tree(num_cycles - 1, height)
    return height

if __name__ == '__main__':
    # Number of test cases
    t = input()
    # Number of cycles for respective test case
    while t > 0:
        # TODO: No bounds check on raw_input
        n = int(raw_input())
        utree_height = u_tree(n, 1)
        print utree_height
        t -= 1


