__author__ = 'Short'
# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys

mask = 0xFFFFFFFF
for lineNum,line in enumerate(sys.stdin):
    if lineNum != 0:
        print(int(line) ^ mask)