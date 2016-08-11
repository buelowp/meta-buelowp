DESCRIPTION = "Calculate Sunrise and Sunset"
SECTION = "console/libs"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/buelowp/sunset.git"

SRCREV = "${AUTOREV}"
PV .= "+git${SRCPV}"

S = "${WORKDIR}/git"

inherit qmake5

FILES_${PN} = "/usr/lib/*
FILES_${PN}-dbg = " \
		/usr/lib/*.debug \
		/usr/src/debug \
		"
