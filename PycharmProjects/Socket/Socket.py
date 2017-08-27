import socket
import sys

sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_address = ('192.168.0.129',8080)
print >>sys.stderr, 'Connecting to %s port %s' % server_address
sock.connect(server_address)

try:
    sock.sendall('mpb8Qasasd')
    print 'Enviado'
finally:
    sock.close();
    print 'conexao fechada'