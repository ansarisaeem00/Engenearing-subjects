message=input("Enter the Message:")
message=list(message.upper().replace(' ', ''))

keyword=input("Enter the Keyword:")
keyword=list(keyword.upper().replace(' ', ''))

alphabet=list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")

keylen=len(keyword)
vegenere=[]

for e in range(len(message)):
	key=e%keylen
	vegenere.append(alphabet[(alphabet.index(message[e])+alphabet.index(keyword[key]))%26])

product_cipher=""
odd=""


for i,val in enumerate(vegenere):
	if i & 1:
		odd+=val
	else:
		product_cipher+=val

product_cipher+=odd

print(product_cipher)
