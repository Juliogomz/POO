#include <stdio.h>
int main()
{

    int i;
    int vetD[30];
    int vetE[30];
    int n;
    int tam;
    char pe;
    int count = 0;

    for (i = 0; i < 30; i++)
    {
        vetD[i] = 0;
        vetE[i] = 0;
    }

    printf("Digite a quantidade de botas: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("Digite respectivamente o tamanho e o lado da bota|| D ou E: [%d] ", i + 1);
        scanf("%d %c", &tam, &pe);
        if (tam < 30 || tam > 60){
            i--;
            printf("Tamanho invalido tente 30 <= tamanho >= 60\n ");
        }
        if (pe == 'D')
        {
            vetD[tam - 30]++;
        }
        else
        {
            vetE[tam - 30]++;
        }
    }

    for (i = 0; i < 30; i++)
    {
        if (vetD[i] < vetE[i])
            count += vetD[i];
        else
            count += vetE[i];
    }
    printf("numero de pares: %d\n", count);
    return 0;
}