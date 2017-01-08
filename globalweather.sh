wget -O globalweather.wsdl 'http://www.webservicex.com/globalweather.asmx?WSDL'
mkdir gen
wsimport -clientjar globalweather.jar -d gen globalweather.wsdl
