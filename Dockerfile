FROM ubuntu@sha256:2e863c44b718727c860746568e1d54afd13b2fa71b160f5cd9058fc436217b30

RUN apt update && apt-get install -y libgtk-4-dev libadwaita-1-dev libgirepository1.0-dev curl && \
    curl -Lo llvm.sh https://apt.llvm.org/llvm.sh && \
    chmod +x llvm.sh && \
    apt install -y lsb-release wget software-properties-common gnupg autopoint libtool git && \
    ./llvm.sh 17 && \
    apt install libclang-17-dev &&  \
    apt install -y gpg wget && \
    wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null && \
    echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | tee /etc/apt/sources.list.d/adoptium.list && \
    apt update && apt install -y temurin-17-jdk && \
    curl -Lo /usr/bin/sbt https://raw.githubusercontent.com/sbt/sbt/1.12.x/sbt && chmod +x /usr/bin/sbt

ENV LLVM_BIN=/usr/lib/llvm-17/bin

WORKDIR /source/sn-bindgen
ENV SCALANATIVE_MODE=release-fast
ENV BINDGEN_REV=23505d91ea3ac50566a8a4ba78f280570f42e7ee
RUN git clone https://github.com/indoorvivants/sn-bindgen.git . && git fetch --tags && git checkout $BINDGEN_REV && sbt devPublish versionDump
RUN chmod +x /root/.ivy2/local/com.indoorvivants/bindgen_native0.5_3/*/exes/bindgen_native0.5_3-*.exe

WORKDIR /source/build

COPY build.sbt .
COPY project/build.properties project/build.properties
COPY project/plugins.sbt project/plugins.sbt

RUN SN_BINDGEN_VERSION=$(cat /source/sn-bindgen/version) sbt update

WORKDIR /source/tmp
ENTRYPOINT ["bash", "-c", "SN_BINDGEN_VERSION=$(cat /source/sn-bindgen/version) sbt clean 'show bindgenBindings' $PROJECT_TO_GENERATE/bindgenGenerateAll"]
