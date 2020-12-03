

package de.re.easymodbus.exceptions;

@SuppressWarnings("serial")
public class FunctionCodeNotSupportedException extends de.re.easymodbus.exceptions.ModbusException
{
  public FunctionCodeNotSupportedException()
  {
  }

  public FunctionCodeNotSupportedException( String s )
  {
    super( s );
  }
}


