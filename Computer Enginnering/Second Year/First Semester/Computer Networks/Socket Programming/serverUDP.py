from socket import *

serverName = 'localhost'

serverPort = 12002

serverSocket = socket(AF_INET, SOCK_DGRAM)

serverSocket.bind(('', serverPort))

print("The server is ready to receive")

while True:

    message, clientAddress = serverSocket.recvfrom(2048)

    modifiedMessage = message.decode().upper()

    serverSocket.sendto(modifiedMessage.encode(), clientAddress)


