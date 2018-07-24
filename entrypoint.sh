#!/bin/bash
echo "Configuration loaded."
mkdir -p cucumber_output
java cucumber.api.cli.Main parallel_cucumber features/*.feature -n 6 --group-by scenarios -o '-t @done -p parallel'