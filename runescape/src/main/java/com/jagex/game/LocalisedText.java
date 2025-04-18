package com.jagex.game;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class LocalisedText {

    @OriginalMember(owner = "client!bba", name = "gb", descriptor = "Lclient!bba;")
    public static final LocalisedText DEBUG_CONSOLE_INFO = new LocalisedText("This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");

    @OriginalMember(owner = "client!bba", name = "ab", descriptor = "Lclient!bba;")
    public static final LocalisedText DEBUG_CONSOLE_ERROR = new LocalisedText("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.");

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "Lclient!bba;")
    public static final LocalisedText DEBUG_CONSOLE_UNKNOWNCOMMAND = new LocalisedText("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "Lclient!bba;")
    public static final LocalisedText CANCEL = new LocalisedText("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!bba", name = "T", descriptor = "Lclient!bba;")
    public static final LocalisedText MEMBERS_OBJECT = new LocalisedText("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Lclient!bba;")
    public static final LocalisedText LENT_ITEM_RETURN = new LocalisedText("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "Lclient!bba;")
    public static final LocalisedText BOUGHT_ITEM_DISCARD = new LocalisedText("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "Lclient!bba;")
    public static final LocalisedText TAKE = new LocalisedText("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!bba", name = "O", descriptor = "Lclient!bba;")
    public static final LocalisedText DROP = new LocalisedText("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!bba", name = "V", descriptor = "Lclient!bba;")
    public static final LocalisedText CONTINUE = new LocalisedText("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!bba", name = "tb", descriptor = "Lclient!bba;")
    public static final LocalisedText FRIENDLIST_FULL = new LocalisedText("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é 200.");

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "Lclient!bba;")
    public static final LocalisedText LOADING = new LocalisedText("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "Lclient!bba;")
    public static final LocalisedText PROFILING = new LocalisedText("Profiling...", "Profiling...", "Profilage...", "Profiling...");

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Lclient!bba;")
    public static final LocalisedText CONLOST = new LocalisedText("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!bba", name = "db", descriptor = "Lclient!bba;")
    public static final LocalisedText ATTEMPTING_TO_REESTABLISH = new LocalisedText("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "Lclient!bba;")
    public static final LocalisedText CHECKING_FOR_UPDATES = new LocalisedText("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Lclient!bba;")
    public static final LocalisedText DOWNLOADING_UPDATES = new LocalisedText("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualizações - ");

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Lclient!bba;")
    public static final LocalisedText LOADINGDOTDOTDOT = new LocalisedText("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!bba", name = "kb", descriptor = "Lclient!bba;")
    public static final LocalisedText FRIENDLOGIN = new LocalisedText(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!bba", name = "sb", descriptor = "Lclient!bba;")
    public static final LocalisedText FRIENDLOGOUT = new LocalisedText(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "Lclient!bba;")
    public static final LocalisedText UNABLETOFIND = new LocalisedText("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!bba", name = "qb", descriptor = "Lclient!bba;")
    public static final LocalisedText EXAMINE = new LocalisedText("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!bba", name = "U", descriptor = "Lclient!bba;")
    public static final LocalisedText ATTACK = new LocalisedText("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Lclient!bba;")
    public static final LocalisedText CHOOSEOPTION = new LocalisedText("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "Lclient!bba;")
    public static final LocalisedText MOREOPTIONS = new LocalisedText(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!bba", name = "X", descriptor = "Lclient!bba;")
    public static final LocalisedText WALKHERE = new LocalisedText("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "Lclient!bba;")
    public static final LocalisedText FACEHERE = new LocalisedText("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!bba", name = "fb", descriptor = "Lclient!bba;")
    public static final LocalisedText LEVEL = new LocalisedText("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "Lclient!bba;")
    public static final LocalisedText SKILL = new LocalisedText("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "Lclient!bba;")
    public static final LocalisedText RATING = new LocalisedText("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Lclient!bba;")
    public static final LocalisedText PLEASEWAIT = new LocalisedText("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");

    @OriginalMember(owner = "client!bba", name = "cb", descriptor = "Lclient!bba;")
    public static final LocalisedText MINISEPARATOR = new LocalisedText(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "Lclient!bba;")
    public static final LocalisedText MILLION = new LocalisedText("M", "M", "M", "M");

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "Lclient!bba;")
    public static final LocalisedText MILLION_SHORT = new LocalisedText("M", "M", "M", "M");

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Lclient!bba;")
    public static final LocalisedText THOUSAND = new LocalisedText("K", "T", "K", "K");

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "Lclient!bba;")
    public static final LocalisedText THOUSAND_SHORT = new LocalisedText("K", "T", "K", "K");

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Lclient!bba;")
    public static final LocalisedText SELF = new LocalisedText("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!bba", name = "hb", descriptor = "Lclient!bba;")
    public static final LocalisedText FRIENDLISTDUPE = new LocalisedText(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "Lclient!bba;")
    public static final LocalisedText IGNORELISTFULL = new LocalisedText("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

    @OriginalMember(owner = "client!bba", name = "R", descriptor = "Lclient!bba;")
    public static final LocalisedText IGNORELISTDUPE = new LocalisedText(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!bba", name = "ub", descriptor = "Lclient!bba;")
    public static final LocalisedText FRIENDCANTADDSELF = new LocalisedText("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!bba", name = "W", descriptor = "Lclient!bba;")
    public static final LocalisedText IGNORECANTADDSELF = new LocalisedText("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!bba", name = "P", descriptor = "Lclient!bba;")
    public static final LocalisedText REMOVEIGNORE1 = new LocalisedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!bba", name = "rb", descriptor = "Lclient!bba;")
    public static final LocalisedText REMOVEIGNORE2 = new LocalisedText(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!bba", name = "ob", descriptor = "Lclient!bba;")
    public static final LocalisedText REMOVEFRIEND1 = new LocalisedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!bba", name = "Q", descriptor = "Lclient!bba;")
    public static final LocalisedText REMOVEFRIEND2 = new LocalisedText(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL0 = new LocalisedText("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL1 = new LocalisedText("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!bba", name = "ib", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL2 = new LocalisedText("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!bba", name = "lb", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL3 = new LocalisedText("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL4 = new LocalisedText("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL5 = new LocalisedText("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL6 = new LocalisedText("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!bba", name = "vb", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL7 = new LocalisedText("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL8 = new LocalisedText("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!bba", name = "pb", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL9 = new LocalisedText("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL10 = new LocalisedText("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!bba", name = "S", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATCOL11 = new LocalisedText("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!bba", name = "Y", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATEFFECT1 = new LocalisedText("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATEFFECT2 = new LocalisedText("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!bba", name = "mb", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATEFFECT3 = new LocalisedText("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!bba", name = "nb", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATEFFECT4 = new LocalisedText("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "Lclient!bba;")
    public static final LocalisedText CHATEFFECT5 = new LocalisedText("slide:", "gleiten:", "glissement:", "deslizamento:");

    public static LocalisedText NO_NAME_PLAYERNAME = new LocalisedText("#Player", "#Spieler", "#Joueur", "#Jogador");
    public static LocalisedText MEMBERS_DESC = new LocalisedText("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    public static LocalisedText SWAP_NOTE_AT_BANK = new LocalisedText("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    public static LocalisedText OK = new LocalisedText("Ok", "Okay", "OK", "Ok");
    public static LocalisedText SELECT = new LocalisedText("Select", "Auswählen", "Sélectionner", "Selecionar");
    public static LocalisedText INVALID_PLAYER_NAME = new LocalisedText("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    public static LocalisedText YOU_CANT_REPORT_YOURSELF = new LocalisedText("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    //		new com.jagex.game.LocalisedText("You already sent an abuse report under 60 secs ago! Do not abuse this system!","Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!","Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !","Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    //		new com.jagex.game.LocalisedText(null,"Dieses System darf nicht missbraucht werden!",null,null);
    public static LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION1 = new LocalisedText("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    public static LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION2 = new LocalisedText("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    public static LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION3 = new LocalisedText("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    public static LocalisedText ABUSE_REPORT_RECEIVED = new LocalisedText("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    public static LocalisedText UNABLE_TO_SEND_SNAPSHOT_BUSY = new LocalisedText("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    public static LocalisedText INVALID_NAME = new LocalisedText("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    public static LocalisedText USE_MEMBERS_SERVER_ITEM = new LocalisedText("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    public static LocalisedText USE_MEMBERS_SERVER_LOCATION = new LocalisedText("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    public static LocalisedText NOTHING_INTERESTING_HAPPENS = new LocalisedText("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    public static LocalisedText I_CANT_REACH_THAT = new LocalisedText("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
    public static LocalisedText INVALID_TELEPORT = new LocalisedText("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    public static LocalisedText USE_MEMBERS_SERVER_COORD = new LocalisedText("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    public static LocalisedText UNABLE_TO_ADD_FRIEND_SYSTEM = new LocalisedText("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    public static LocalisedText UNABLE_TO_ADD_FRIEND_EXISTS = new LocalisedText("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    public static LocalisedText UNABLE_TO_ADD_IGNORE_SYSTEM = new LocalisedText("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    public static LocalisedText UNABLE_TO_ADD_IGNORE_EXISTS = new LocalisedText("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    public static LocalisedText UNABLE_TO_DELETE_FRIEND = new LocalisedText("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    public static LocalisedText UNABLE_TO_DELETE_IGNORE = new LocalisedText("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_BUSY = new LocalisedText("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_UNAVAILABLE1 = new LocalisedText("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_UNAVAILABLE2 = new LocalisedText(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_NOTFRIEND1 = new LocalisedText("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_NOTFRIEND2 = new LocalisedText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_PASSWORD_A = new LocalisedText("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_PASSWORD_B = new LocalisedText("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_1 = new LocalisedText("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_2 = new LocalisedText(null, "indem du dich ins Spiel einloggst.", null, null);
    public static LocalisedText SNAPSHOT_BUFFER_EMPTY1 = new LocalisedText("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    public static LocalisedText SNAPSHOT_BUFFER_EMPTY2 = new LocalisedText(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    public static LocalisedText NAMEDIALOG_NOTFOUND = new LocalisedText("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHAT1 = new LocalisedText("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHAT2 = new LocalisedText(null, "geschickt werden.", null, null);
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHATWORLD1 = new LocalisedText("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    public static LocalisedText CHAT_DISABLED = new LocalisedText("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    public static LocalisedText UNDER13_FRIENDSCHAT_PREFIX = new LocalisedText("friends_chat", "friends_chat", "friends_chat", "friends_chat");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_NOT_IN_FRIENDS_CHAT = new LocalisedText("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_TOO_LOW_RANK = new LocalisedText("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de discussion.", "Você pode falar neste bate-papo entre amigos.");
    public static LocalisedText UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_ERROR = new LocalisedText("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
    public static LocalisedText FRIENDS_CHAT_STILL_IN_CHANNEL = new LocalisedText("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    public static LocalisedText FRIENDS_CHAT_NOT_IN_CHANNEL = new LocalisedText("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    public static LocalisedText FRIENDS_CHAT_ATTEMPTING_JOIN = new LocalisedText("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    public static LocalisedText FRIENDS_CHAT_SENDING_LEAVE_REQ = new LocalisedText("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    public static LocalisedText FRIENDS_CHAT_JOIN_IN_PROGRESS = new LocalisedText("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    public static LocalisedText FRIENDS_CHAT_LEAVE_IN_PROGRESS = new LocalisedText("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    public static LocalisedText FRIENDS_CHAT_INVALID_NAME = new LocalisedText("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    public static LocalisedText FRIENDS_CHAT_NOT_AVAILABLE = new LocalisedText("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
    public static LocalisedText FRIENDS_CHAT_JOIN_SUCCESS_A = new LocalisedText("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando no momento no bate-papo entre amigos: ");
    public static LocalisedText FRIENDS_CHAT_JOIN_SUCCESS_A_U13 = new LocalisedText("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando no momento no bate-papo entre amigos do jogador: ");
    public static LocalisedText FRIENDS_CHAT_JOIN_SUCCESS_B = new LocalisedText("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    public static LocalisedText FRIENDS_CHAT_JOIN_ERROR = new LocalisedText("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
    public static LocalisedText FRIENDS_CHAT_JOIN_ATTACKBLOCKED = new LocalisedText("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    public static LocalisedText FRIENDS_CHAT_JOIN_NOTEXIST = new LocalisedText("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    public static LocalisedText FRIENDS_CHAT_JOIN_ROOMFULL = new LocalisedText("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    public static LocalisedText FRIENDS_CHAT_JOIN_LOWRANK = new LocalisedText("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.");
    public static LocalisedText FRIENDS_CHAT_JOIN_BANNED = new LocalisedText("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.");
    public static LocalisedText FRIENDS_CHAT_JOIN_IGNORELIST = new LocalisedText("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode participar do bate-papo entre amigos deste usuário.");
    public static LocalisedText FRIENDS_CHAT_USER_JOINED = new LocalisedText(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    public static LocalisedText FRIENDS_CHAT_USER_LEFT = new LocalisedText(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    public static LocalisedText FRIENDS_CHAT_USER_KICKED = new LocalisedText(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    public static LocalisedText FRIENDS_CHAT_LEAVE_KICKED = new LocalisedText("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    public static LocalisedText FRIENDS_CHAT_LEAVE_REMOVED = new LocalisedText("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    public static LocalisedText FRIENDS_CHAT_LEAVE_DEFAULT = new LocalisedText("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    public static LocalisedText FRIENDS_CHAT_ENABLED_A = new LocalisedText("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!");
    public static LocalisedText FRIENDS_CHAT_ENABLED_B = new LocalisedText("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    public static LocalisedText FRIENDS_CHAT_DISABLED = new LocalisedText("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!");
    public static LocalisedText FRIENDS_CHAT_KICK_LOW_RANK = new LocalisedText("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    public static LocalisedText FRIENDS_CHAT_KICK_USER_HIGHER = new LocalisedText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    public static LocalisedText FRIENDS_CHAT_KICK_NOT_FOUND = new LocalisedText("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    public static LocalisedText FRIENDS_CHAT_KICK_SUCCESS = new LocalisedText("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
    public static LocalisedText FRIENDS_CHAT_KICK_SUCCESS_RESET = new LocalisedText("Your request to refresh this user's temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.");
    public static LocalisedText MUTED_TEMPORARY = new LocalisedText("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    public static LocalisedText MUTED_TEMPORARY_TIME_A = new LocalisedText("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    public static LocalisedText MUTED_TEMPORARY_TIME_B = new LocalisedText(" days.", " Tage.", " jours.", " dias.");
    public static LocalisedText MUTED_TEMPORARY_1DAY = new LocalisedText("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    public static LocalisedText MUTED_PREVENT = new LocalisedText("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    public static LocalisedText MUTED_PERMANENT = new LocalisedText("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    public static LocalisedText MAINLOAD110 = new LocalisedText("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
    public static LocalisedText MAINLOAD110B = new LocalisedText("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
    public static LocalisedText MAINLOAD120 = new LocalisedText("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
    public static LocalisedText MAINLOAD120B = new LocalisedText("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
    public static LocalisedText MAINLOAD130 = new LocalisedText("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
    public static LocalisedText MAINLOAD130B = new LocalisedText("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
    public static LocalisedText MAINLOAD140 = new LocalisedText("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    public static LocalisedText MAINLOAD140B = new LocalisedText("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");
    public static LocalisedText MAINLOAD150 = new LocalisedText("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    public static LocalisedText MAINLOAD150B = new LocalisedText("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");
    public static LocalisedText MAINLOAD160 = new LocalisedText("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
    public static LocalisedText MAINLOAD160B = new LocalisedText("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    public static LocalisedText MAINLOAD170 = new LocalisedText("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
    public static LocalisedText MAINLOAD170B = new LocalisedText("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
    public static LocalisedText MAINLOAD180 = new LocalisedText("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    public static LocalisedText MAINLOAD180B = new LocalisedText("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    public static LocalisedText MAINLOAD190B = new LocalisedText("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
    public static LocalisedText SNAPSHOT_PLEASECLOSE1 = new LocalisedText("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    public static LocalisedText SNAPSHOT_PLEASECLOSE2 = new LocalisedText(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    public static LocalisedText SYSTEMUPDATE = new LocalisedText("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    public static LocalisedText USE = new LocalisedText("Use", "Benutzen", "Utiliser", "Usar");
    public static LocalisedText CLOSE = new LocalisedText("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    public static LocalisedText FROM = new LocalisedText("From", "Von:", "De", "De");
    public static LocalisedText FRIENDLIST_TIMED_SAVE = new LocalisedText("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportés à votre canal de discussion dans les 60 prochaines secondes.", "Mundanças vão ocorrer em seu bate-papo entre amigos nos próximos 60 segundos.");
    public static LocalisedText UNKNOWN_FRIEND_DISPLAYNAME_PLACEHOLDER = new LocalisedText("Friend", "Freund", "Ami", "Amigo");

    @OriginalMember(owner = "client!bba", name = "N", descriptor = "[Ljava/lang/String;")
    public final String[] localisations;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public LocalisedText(@OriginalArg(0) String english, @OriginalArg(1) String german, @OriginalArg(2) String french, @OriginalArg(3) String spanish) {
        this.localisations = new String[]{english, german, french, spanish};
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)Ljava/lang/String;")
    public String localise(@OriginalArg(1) int language) {
        return this.localisations[language];
    }

    @OriginalMember(owner = "client!bba", name = "toString", descriptor = "()Ljava/lang/String;")
    @Override
    public String toString() {
        throw new IllegalStateException();
    }
}
