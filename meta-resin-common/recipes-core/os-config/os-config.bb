DESCRIPTION = "Resin OS configuration tool"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${RESIN_COREBASE}/COPYING.Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = " \
	file://os-config.json \
	"
S = "${WORKDIR}"

do_install() {
	install -d ${D}${sysconfdir}
	install -m 0644 ${WORKDIR}/os-config.json ${D}${sysconfdir}
}
