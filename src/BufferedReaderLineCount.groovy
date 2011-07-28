def br = new BufferedReader( new InputStreamReader(System.in))
def count = 0
def line=''

while( (line=br.readLine()) != null) {
	println "${++count}: $line"
}

println "Total Count: $count"
/* EOF */