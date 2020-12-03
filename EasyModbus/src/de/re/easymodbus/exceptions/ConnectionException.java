

package de.re.easymodbus.exceptions;

@SuppressWarnings("serial")
public class ConnectionException extends de.re.easymodbus.exceptions.ModbusException
{
  public ConnectionException()
  {
  }

  public ConnectionException( String s )
  {
    super( s );
  }
}


