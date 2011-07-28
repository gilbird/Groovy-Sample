#!/bin/env groovy

def count = 0

new File( "./src/LineCount.groovy").eachLine { line -> 
	count ++
	
	println "${count}: $line"
}

println "Total Count: $count"
/* EOF */