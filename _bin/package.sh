#!/usr/bin/env sh
# abort on errors
set -e

cd ..

mvn clean package -Dmaven.test.skip=true

cd -
