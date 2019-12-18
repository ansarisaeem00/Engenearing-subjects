'''
Name:Siddiqui Neha Hafiz
roll_no:14co09
Aim:To implement Rsa

'''
import random


def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def multiplicative_inverse(e, phi):
    d = 0
    x1 = 0
    x2 = 1
    y1 = 1
    temp_phi = phi
    
    while e > 0:
        temp1 = temp_phi/e
        temp2 = temp_phi - temp1 * e
        temp_phi = e
        e = temp2
        
        x = x2- temp1* x1
        y = d - temp1 * y1
        
        x2 = x1
        x1 = x
        d = y1
        y1 = y
    
    if temp_phi == 1:
        return d + phi


p=int(raw_input("Enter value of p :"))
q=int(raw_input("Enter value of q :"))
m=int(raw_input("Enter message value :"))
n=p*q
phi=(p-1)*(q-1)
e = random.randrange(1, phi)
#Use Euclid's Algorithm to verify that e and phi(n) are comprime
g = gcd(e, phi)
while g != 1:
    e = random.randrange(1, phi)
    g = gcd(e, phi)
print ("e = %d "% e)
d = multiplicative_inverse(e, phi)
print ("d = %d "% d)
c = (m**e)%n
print ("c = %d "% c)

'''
codept@codept-24 ~/Desktop $ python rsa1.py
Enter value of p :2
Enter value of q :7
Enter message value :8
e = 5 
d = 5 
c = 8 
'''

