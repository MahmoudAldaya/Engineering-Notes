from socket import *

serverPort = 12001

serverSocket = socket(AF_INET, SOCK_STREAM)

serverSocket.bind(('127.0.0.1', serverPort))

serverSocket.listen(True)

print("The server is ready to receive")

while 1:
    connectionSocket, address = serverSocket.accept()

    sentence = connectionSocket.recv(1024).decode()

    capitalizedSentence = sentence.upper()

    connectionSocket.send(capitalizedSentence.encode())

    connectionSocket.close()
