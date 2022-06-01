import sys
sys.stdin = open('../input/2050.txt')

if __name__ == '__main__':
    container=input()
    for i in container:
        ans=ord(i)-64
        print(ans, end=" ")