FROM anapsix/alpine-java
ADD entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]
#CMD ["/bin/bash"]