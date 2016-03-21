/**
 * 
 */
function getCurrentDomainUtils() {
	var urlApp = window.location.href;
	var tab = urlApp.split("/");
	var domaine = tab[0] + "//" + tab[2] + "/" + tab[3];
	return domaine;
}