import socket
import  sys

sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM);
client_address = ('192,168,0,129', 8080)
server_address = ('localhost',8080)
print >>sys.stderr, 'starting up on %s port %s' % server_address
sock.bind(server_address)

sock.listen(1)
while True:
    print >>sys.stderr, 'waiting a connection';
    connection , client_address = sock.accept()
    try:
        print >>sys.stderr, 'connection from', client_address

        while True:
            data = connection.recv(16)
            print >>sys.stderr, 'received %s' %data
            if data:
                connection.sendall(data)
            else:
                break
    finally:
        connection.close()