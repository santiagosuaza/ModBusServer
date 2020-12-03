
package de.re.easymodbus.exceptions;

@SuppressWarnings("serial")
public class StartingAddressInvalidException extends de.re.easymodbus.exceptions.ModbusException
{
  public StartingAddressInvalidException()
  {
  }

  public StartingAddressInvalidException( String s )
  {
    super( s );
  }
}


