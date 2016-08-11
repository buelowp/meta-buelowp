DESCRIPTION = "Pictureframe"
SECTION = "console/apps"
LICENSE = "CLOSED"
DEPENDS = "qtbase qtmultimedia"

SRC_URI = "git://github.com/buelowp/pictureframe.git;protocol=http"

SRCREV = "${AUTOREV}"
PV .= "+git${SRCPV}"

S = "${WORKDIR}/git"

inherit qmake5

FILES_${PN} = "/usr/local/bin/pictureframe"
FILES_${PN}-dbg = " \
		/usr/local/bin/.debug \
		/usr/src/debug \
		"
