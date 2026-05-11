package fr.univ_amu.iut.exercice3;

/**
 * Exercice 3 - Convertisseur de chiffres romains en nombres arabes.
 *
 * <p>
 * Règles :
 *
 * <ul>
 * <li>Les symboles valides sont
 * {@code I=1, V=5, X=10, L=50, C=100, D=500, M=1000}
 * <li>Lus de gauche à droite, les symboles s'additionnent :
 * {@code VI = 5 + 1 = 6}
 * <li>Un symbole placé avant un symbole de valeur supérieure se soustrait :
 * {@code IV = 5 - 1 =
 *       4}
 * <li>Les seules soustractions valides sont :
 * <ul>
 * <li>I avant V ou X ({@code IV = 4}, {@code IX = 9})
 * <li>X avant L ou C ({@code XL = 40}, {@code XC = 90})
 * <li>C avant D ou M ({@code CD = 400}, {@code CM = 900})
 * </ul>
 * Toute autre soustraction doit lever {@link IllegalArgumentException}.
 * </ul>
 *
 * <p>
 * Conseils TDD : commencez par gérer uniquement {@code I}, puis {@code II} /
 * {@code III} (fake
 * it), puis {@code V} (triangulation), puis {@code VI} (addition de deux
 * symboles différents), puis
 * {@code IV} (introduction de la soustraction). À ce moment-là, <b>extrayez une
 * méthode</b> pour
 * calculer la valeur d'un symbole - vous en aurez besoin pour les symboles
 * suivants.
 */
public class ConvertisseurDeNombreRomain {

  public boolean verifieSoustraction(String chiffreRomain, int i) {
    boolean estSoustrayable = false;
    if (getListeSuivants(chiffreRomain.charAt(i)).contains(String.valueOf(chiffreRomain.charAt(i + 1))))
      estSoustrayable = true;
    return estSoustrayable;
  }

  public String getListeSuivants(char c) {
    switch (c) {
      case 'I':
        return "VX";
      case 'X':
        return "LC";
      case 'C':
        return "DM";
      default:
        return null;
    }
  }

  public int valeurDe(char charactere, string chiffreRomain, int i) {
    if (estSoustrayable == true){
    total = valeurDe(chiffreRomain.charAt(i)) - valeurde(chiffreRomain.charAt(i + 1))
    return total;
        }
      }

  }

  public int enNombreArabe(String chiffreRomain) {
    int total = 0;
    char[] listCaractère = chiffreRomain.toCharArray();
    for (int cpt = 0; cpt < chiffreRomain.length(); cpt = cpt + 1) {
      // if ()
      // if (ordreRomain.index0.currentChar < odreRomain.index0.nextchar) {
      // ordreRomain.index0.currentChar - odreRomain.index0.nextchar
      // }
      switch (listCaractère[cpt]) {
        case 'I':
          total = total + 1;
          break;
        case 'V':
          total = total + 5;
          break;
        case 'X':
          total = total + 10;
          break;
        case 'L':
          total = total + 50;
          break;
        case 'c':
          total = total + 100;
          break;
        case 'D':
          total = total + 500;
          break;
        case 'M':
          total = total + 1000;
          break;
      }
    }
    return (total);
  }
}
// Quand vous arrivez à "IV" = 4 : extrayez une méthode valeurDe(char)
// pour factoriser, puis ajoutez la logique de soustraction.
//
// Pour les exceptions : une soustraction est valide seulement pour
// I avant V/X, X avant L/C, C avant D/M. Tout le reste est invalide.
