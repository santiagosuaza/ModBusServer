
package de.re.easymodbus.modbusserver;

import java.net.SocketTimeoutException;

class ClientConnectionThread extends Thread 
{
	private java.net.Socket socket;
	private byte[] inBuffer = new byte[1024];
	ModbusServer easyModbusTCPServer;
	
	public ClientConnectionThread(java.net.Socket socket, ModbusServer easyModbusTCPServer)
	{
		this.easyModbusTCPServer = easyModbusTCPServer;
		this.socket = socket;		
	}
	
	public void run()
	{
            this.easyModbusTCPServer.setNumberOfConnectedClients(this.easyModbusTCPServer.getNumberOfConnectedClients()+1);
            
            try
            {
                socket.setSoTimeout(easyModbusTCPServer.getClientConnectionTimeout());
                java.io.InputStream inputStream;                   
                inputStream = socket.getInputStream();
                while (socket.isConnected() & !socket.isClosed() & !socket.isClosed() & easyModbusTCPServer.getServerRunning())
		{
                	
                    int numberOfBytes=(inputStream.read(inBuffer));
                    if (numberOfBytes == -1)
                        break;
                    if (numberOfBytes  > 4)
                    (new ProcessReceivedDataThread(inBuffer, easyModbusTCPServer, socket)).start();
                    Thread.sleep(5);
		}
                this.easyModbusTCPServer.setNumberOfConnectedClients(this.easyModbusTCPServer.getNumberOfConnectedClients()-1);
                socket.close();
            } catch (Exception e)
            {
                this.easyModbusTCPServer.setNumberOfConnectedClients(this.easyModbusTCPServer.getNumberOfConnectedClients()-1);
                try
                {
                 socket.close();
                }
                catch (Exception exc)
                {}
                e.printStackTrace();
            }
	}
	
}
