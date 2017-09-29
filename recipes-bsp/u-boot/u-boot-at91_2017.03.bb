require u-boot-atmel.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=2687c5ebfd9cb284491c3204b726ea29"

SRCREV = "aa1e7b7cd66ceeabf2e276e355d0d0e34016fe1c"

PV = "v2017.03-at91+git${SRCPV}"

COMPATIBLE_MACHINE = '(sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd)'

UBRANCH = "linux4sam_5.7-rc4-fitimage"
SRC_URI = "git://github.com/QSchulz/u-boot-at91.git;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
