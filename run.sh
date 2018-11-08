#!/bin/bash

app_path=`pwd`

docker rm flaviodev-sicp -f
docker run -it --name flaviodev-sicp -v $app_path/exercises:/usr/src/app:rw flaviodev-sicp bash
