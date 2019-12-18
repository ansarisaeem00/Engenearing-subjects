def operator(o):
	if(o == '+' or o == '-' or o == '*' or o == '/' or o == '^'):
		return True
	else:
		return False


s = input("Enter Expression:")
add, t = [], []
i = 1

while(i<len(s)):
	if(operator(s[i])):
		if((s[i-1] != '(' and s[i-1] != ')')):
			t.append(s[i-1]+s[i]+s[i+1])
			i += 2
		else:
			add.append(s[i])
			i += 2
	else:
		i += 1

for j in range(len(add)):
	t.append("t"+str(j+1)+add[j]+"t"+str(j+2))

for i in range(len(t)):
	print("t"+str(i+1)," = ",t[i])

