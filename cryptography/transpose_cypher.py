#NAME:ANSARI SAEEM 
#ROLL_NO:15CO12
#AIM:IMPLEMENT TRANSPOSE CIEPHER

def split_len(seq, length):
    return [seq[i:i + length] for i in range(0, len(seq), length)]

def encode(key, plaintext):

    order = {
        int(val): num for num, val in enumerate(key)
    }

    ciphertext = ''
    for index in sorted(order.keys()):
        for part in split_len(plaintext, len(key)):
            try:
                ciphertext += part[order[index]]
            except IndexError:
                continue

    return ciphertext

print(encode('04', 'HIIMSAEEM'))

#
#codept@ktc ~/Desktop/15co12 $ python transpose_cypher.py 
#HISEMIMA
