// This class was generated on Tue, 04 Sep 2018 12:15:13 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Order.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+x9bW8bt9Lo9/sriJwHaAxIcm0nOT0BLnAdx2192iSG7ZyDi5xConZHEh9zyS3Jtaxe3P/+gENy39d2ElltEn5IYJHcXc5wOG+cGf6/J1ebHJ68fPJOpaCejJ78iypG5xze0sw2Pxk9+QU21Y/XoBPFcsOkePLyydUKiLQPkhQMZVxPnoyeHCtFN+6t34+eXABN3wm+efJyQbkG2/B7wRSkZcO5kjkow0A/efmhnI82iolld0KJAmpgalgGjbk127vTTKkBQkVK7IgRYYJ8OBMGlADT7CMLqTJqfnu6MibXL/f3jZRcTxiYxUSq5f7KZHxfLZKjo6N//E1DYr8xfj55sTchl5BIkWpCFRDlwSTrFeNAForiSMqJro2SuWuc/Kf4/vujZM5lcv17IQ3gb/d/oo2SYula3koDL13zfr2dWBgVLAtOFYHbXIHWTAqSK3nDUtBkWbCUigTIvDAklaCJkIYo+G9IDKGcEyZuKGcpIkP7+ey3J/SZyysKzv//6N41ZmljafFnd0XPXhO5ICaQ4GRHcxMGhGnOLzR15+i6iJEEmFmBIgnNTaGA5HST2R6WZZAyaoBviFSEFmYlFfsDCC2HLGy78PuMLgwo/zeSPJNiy5D/ysQ1qYPSwQFn4lo3UBBamhg4FoTaedl1svsBtBkr4NRASj78fHx1+u74kuCjvz3dT2Wi92nO9uUNqBsG6/2/ragBSfUYh+xNyJUkicxyDgYRaNGRWwKnfEQKDUgLM9cEM3wxWTOzcu0/nV7NSAZmJdMWwl5sn0uBSHBEHUdVW5dOkAiI2eSWZCzLSFaWaHQxz5jB+Xv82e1Jd0TqKwWLBgS+oTv9clUMVUsw5P3Fr7haGb0GP3u36gnlfGSHz5lwPW5FwjoxTT68vzgjV5Dl9omxY8YG0nv58Yvnf/9+Dxd9Qn6UiuQKxrmSiWWEYmk5fsKL1BPJf81GZPZ0NkKuP9ubkWRFLYcGpSfISmcW1hlhGsdfw4YEerWwSoG7ekWNI19CSxQ4GB081C6gtgsnDDbvaOGQmjr0V2+9iwJHhGqSwoIJSMl8Qz5c/HhCDr9/9qJagvV6XS2AWiT2nx0xMbdmb+KZxxwc8nAfOsLYGfyWplrA+6Yu5D9fXZ0HMiylthkg3h1BoIA3pu9+d+f+AZGLE7TS3i7fvRvl+T9++KFUXJ7tjTy70aBuQNu1p8LKVhQ7fvEsoReCZnO2LGSh+YakjSXWkFFhWKKDRHbb8BKAfEBxcuFnqFs0RAXFuVGt2VJYcaf37bPjAFL75+TWgrH3GCLvMllBRrtroUN7tRxlU3dF6nzaSvQtUn8lduTcqm3dqdI0ZU6hPDOQNUV0t685+e1i9Jhz8m5B7Kd6psn5u6ZkCS3D+oMu5mOHds+hEcFZoQ1BvRVV+CVlQjt1tj7+M8V9GzSxuQM0sWmD5lu2A5oUVt0lmVTwiCAO0RdKBaSiJm012x+TroZnloNIQST2oebUGh2PObchZr5QdGlZ2wVoyQuvUlcz7O3+M3DIOjyD9XKKY0FsxyPw4O2YGjhiyzvijVWPBjStrpZ1n45vtc5ECgO3ZgwikSkTS4JbGR7fgzJngqrNqf9sY/Kdrj5VH03azrSdsH9TcMPyQuVSAyn9K28o4+T01oDQlkWQp2/O3pzukXOqDHkn4KXV1zNq7NpVz4DWdAnklUwZ6HuVmsPvnz3f25FyZtqatblfqf5k/Fyt5UuC1EfstB6EiRfbwcRvD+AZQjZ9Ie73Y3KvdwKGxa8U0BK/oWV74rcav2UeM0RvOTWrS0NVE9P11hblSULznG+cPe2mag0agw4pbahIQH9H3l+c6RHR9hXYZX/X7PAbyguY7Eby5NbEV6L2ZAvSTu+fIR/zgek97rx+e6id4oyMy6610uqINku0WaLNEm2WaLNEmyXaLNFmiTZLtFmizRJtlkeyWQY5EjO8xZJ8S5cnOYPEdm+dSZwU2sisL/QJIwxai+paeiSMfwtZr6QPSgCNIjOnG41naVWgCmk8wTShXEtyLeRaEOoO1PBL2xOrx2mqQGtyLpWxEHaB7RnRMMNsZy/kuX8AQ12UoD7IKZfaUE78kxPyhuba7ucP/kP/clyKSfEGDLXcqxISS2ZWxXySyGx/KeWSAzv4QexzNvdvYyIvzP6aXbP9wbftIfJ/vnrzK3k+OSAfjgsjF4xzK/0XUmWoEyjJ9UvENy2MLIMYqDGKzQsDzcPK9RHKrKsLFFvPD/Y1JBifoCe24W+0+gQ2j8MnxmYF4/oXxuUX9ra/xq9dJF6voW0HTNNyQGeFa33dlRZSjMvVrizzsMYhBNCdFlNr68kMDMtAEwGQQorbAHHALDsfEcX09ciahhJjo3QCgiomNVmvQAFZMAHjpaJMlN9gwgWEMClIxpYrQ+bg3z4hb6WpyBGFQiKzTAorG5TdicpskCxkDkLLQiUwIReQFiKlwoQn8MPAU+3CSOCW2kUbkVnAUfjEJDRwJmB6gMEihS4o5xsXD2I1U5ypXFRPh0BJbRSAmYoim4OauTiU0EYzaLZYbWy2Ay27YNzqxziDppLd6mlpJsQ2p4TLxJ3SOxpQkCvQIIznaQoypmFC3pdICq/F5y0hOHQQpBPOXYyCRV8YqENgjV/Z5nOtFXMxjIlMffDiiaI3IMjPstA+snK/6tyRHp4CZzegNlMN6oYl0LL7O509gax+EPGDJuRcWi1vsWAJkLm8HZE5XXqM4O7Ka/0WYTsCtUbNzeCJRnsXQNfvZkr+aVXa2WtVqM2MMOH/JL9S8fkb4iPhQIT2QhJ6hmFx5LnT+XYsvmb74Fyd5dfYSHbbFDAic1lwuKEqHRElaYrE5WON13SzK/CK+TSwgyZ8zY4ugAumtBm72FkQhpkNmQOXa0I9/yrZkVQlL+tlZdac6mFnmoklh+o1lldZ4fURzGxCTqiwQo2SBafG2jpSbUZkwaVUFu0yQ7RTK80yEGayK329Ke16tYeyawD3Vo+HECJWqoYNUqsEgCPHthA++PsRqbMAEoBD5QKtYBBGbby7Kuga+NOqGyRZQXJtFVLLWKyGZtULO59FwSt9dTek3MDb4TBKD/v3K+YRPACnumAGGkSzW4bUgOVoGMyjXjCd8tYD5YiwRan7NflV4GVO4S6j6F8p+gfjI5Iy5XejgVu7x4pkZS2vmYBbDNb/N+UZVWbmthrhVKQZVddWAFFBzkTKqNg5rWRMTKkC2tl8jY4uAldsuQK7+eAG3BlTym4YZod45lTYHRPiQBtaLKaPoK6uDTWA+Di7fDc+OnjxYnxoXxbeNQkO0YXXOCgvVZX2Jj45duqtkIbMTihnC6kEo7MJ+RflKGg21ayY9vkuBa8nxXDmfr3/ZUKO3ehNyFoJfa2Rl3YkwnH3wBMqaErt4AD+3eP/SXMq3HBYQGIKdc8Dl2tm/gBlyco+dk2FkaL/kf0A9c6p7HCIyg579P+Emc2IGLkWSCI3jHO6hAm5zCjnoKwQFdYGKl+CxDg9mO1+9xwNwXXUA5fdLVYT4AifLuaFmo+IALZczaVaSemUoJTZDyfmXoAPA43fR9aOVU3Ipf/knDKlJH6s/vW76QwZFb6jBKI120rVbpjWzGWHUb6mG03oDWUcjep5YVxSQ+/7SBJUF2efWFQQC/xfjbSfDZHAs37HR2O516j/fsyiH83s8JnVTwPaHkoGzsOGzFRLZaxSaU1Wp5Qip4bUcvGfClBCg1N7Mio25EcFIlkRA0oxIxUDXck53/dTgfH3d5KQ092CHwZSgtBZyKlhN+CEirZTOFkx8ddYaS86phZTzRzRZkdPOoVZy3GZCmQlHUFJd4BYD0lqTBhYKtwp+06V2Fegzb5//diO1ft7fpFSa2osmM+U8GMsQShYspLtf2bmZ3gtEoeVwD8poIa8Ugz1W6Y7zpCfXnVcIKVMbo99/0vP2Ir4LFxG5mOnYKQys5+0PCU4vqkJE7TWkk/BOjmcdaeNRETWUvF0zXybVeKoQv5TCO9T5ZCSXLEEyNOT9+d7Pn3HsklxTRLcoWgAKKn1eO5MPqOo0C4Ldyv5rUYVn3g2hhu6S57N9j5XOzIC219T1iwy/2C5w6FVs34v2A3l1jQkV5ucJajKqbqZ5NBuSdIboLU3E5dtWn8LngLXhlRucRCTNbtmOVg5I9XSOeXPKzj2dmaezpkyq2lKTctxWW/u83lQkY4pl8JliD9SYviVrDwIROeQMMoJhyXl7siyxpup+6hcEJz6iGxkQfRKFjzFHFdMz3brJiShWsuEYXYaTtFuN5bB+A8PEJ2Qf69AwA2gUq7Z3CrgIVcWoacqJbM05M7PvP/nasV0Xz55mTleHTNz7nPGm1r+jzBXBVUbcnRA3NEsSwOHWVlBxnQ485rLwponNCcboGpXFhVklPFpdbZVy9Rt9fTndZeHXewPSAk+U9qEn83U3+fWDn3xrJaYimcqlHO5hpTMYSGVo83D58+HRrlscbvUbZb+f7ocXbOlmJCf5dpSywifWoIA5UzBJIHckllGb1lWZISDWJpVSE5vQG9X9vD5s05OrT8Tt9phEIjU2KcLgUhKHzpLArdMmz+5SAHcIgnwaataQbO9Szqhn2/GvjhDWitlEI6Ft7wH3jpnezsQpu2aH/TJu3OWhT+bVmbz+IdRlLstBtNFwXn3GKG/vzn116fnF6cnx1enrwMFKrP5TpPy2bbPdV5oJiwJ2/YRESy5dn8hmW/8QSViw6k1VFhmOAeic86M5QvS+TpHhFMdTjEuqmIgICok4tl/+c0dsb1+bA7j8N89U85BaSlGVfN32vlPd3i8tGQ3ILqANJo/DRJ8BS65X8kdQpWxNOXQBavZ/mlwuXd4krR6OMadGIlnDEAyjPPjUB+nfdkEK6/dq6yQ2mQscfihdj98p0eNd+8GU7mCBbttRTX5ph7dGbtGTkEyVj/xwWUBObs8GC0W7ZmXTT0qKnaVIUR/ynxV9xC3bPs0WvTPOyLKGN94sjzuhEI9lI26r9xJ2P6jbaLOmkSdyUDUfvzObBiM+mrrE7XGLnGc08055b4YztnrmllISUb1NaRW29L+4NFUT9AEjcBw3oZ1ikKIjjUPQkylj5th4HW49nPWSMAvzPmGgEjUBrVEq5fi6UGuGBhrBdxYUAXGS7+iGo4OS/eVkQQDs0OxDV3wbRcKOV9J0aP/5L65hmzf0sNAbE/dSbo9Deiu2fWFHbQ6huYaIkCYIMxoq6pIwRLKW5F6H04nBy+e+dF2S+Scio6ti9U6TDFhwuwrSPavxhenJ2N8dB/Ex5n5XcfJh0f06ZU+Juqi/5DSnp6c7O0IM94/hxWP0mA2+c14cuK8C6hh+6/6nYWx3F63XGJtO+9fPnhOUrZkxm/I9nOJFNoaR/YTtOpNQZsQjuYw8Pb1iQuS1MXc1XIpw6+eXr793BX9CCMKEwj66Lyns9+cwkG7PdMOiO2bd7evz6BqLNtfgBYH98lXTaIPEsvIbzvxVI3mISaM3rRt6w9X9JacVZKoLxX4dmpFVSsNuGzsibKwr+x6IR4cqk5eSbMiM/xG6oNX3Q8XvNqoifn4zgP36S746Z3R+99pj4cJuSzyXCrjNSLTULUwnsQXDJOCb2p+dqfkemQyTQ4O6q45Ll30OWEiZTcsLSh3SQIHz3qHBc8A6N1w49qC9aBumNQ7+AvpYx+DxK1s5vouOS9UsqIayHvB+jJjfPe0EMy0smPaXcOJWGEowaETckqTVbORgDZ0zplegasTKIxdaDIHswbAAJywv/DwFuyzwvS+qhaG6OuJUud3kcqp6ZT72qDonTKNzYsqPiZhlC9dKJn5Koz+q1urjHmcoZ2AdsQrBfQ6leseTkVxWNOxF5p6uJQ0JYS09gEqykq6ZB4+5nBQFsD1gffVSYspX8gMZP59I99k6Ti06BXLc6whuaIi5b6apC6Uy2Kwq5YyjfLTBaVREUKR5mrfh2Is3EFODglbbMjMvXtSTnbmOIcHCn5H1jCzE5vihGYk54V2PLXRECYXfocpht/lRGckY6L+xDRMetae7FU1E5Tx6BrNpWZ45O8lMCI+hYRldkMrSFxImbP83D4f65IBuC9QslKw+N//eRIUlhRugFvymeR0k1OOST93H7IXSoFIwin7f564KYdmfyRAtxPU3yHnOyh5XuuqnT/WWrv0XNFqCG10ZFF9p0O/Ffl+Kuku2cKQtaL5A6h4a/h7IwVsekrM+lk1y8xWjX2yxi20IzS3Kq5U5YIJKvBktXbSXz9YnVOOscDILJ0ASosdJK+HKfcYr62evoiUlQJoxqSMnx0e/L1CxINCU5q7ZiA2xQ/ajbKBB98NbISWLhZuXFioc26FvK87A6eOBQq8JSgX8eBAs5Bydg1k9s/z/zurMtWsEWPKWImqVvvdsVHHJfsLT/R/6+rt69q3fMxsirEz6ISWhaYiNSt9T/TUj16JKmM5QrD8ouLDnCY+7IY2KWRENAD5cBLaTiwhfCzZbNviGuAKJVtqlVmvWiNfiHwh8oVvji+U6nCn4k/ZHDlD5AyRM3xrnCHYOc0z6qoxcoXIFSJX+Fa5Qunp6mUP9d7IJyKfiHziW+MTpVO9c+oVrYrIFyJf+Er5wkNiP+KeiXsm7pmPiZZyAQft6Jt6a5dGjs/PMO4MVJUTFfKkMBznvQ8UVpBIkTDeeATLuLscyFqKrzug9gEnjdxfcpznQBVmrdc6XKQZGOMrxijIpTJ6Z4Xh6heu1mvC1dt7wsxCLEdt4M6uwr2RLIH2UjeaP3Kt/bPh/kEs6uuKpm4Zpv5SzB9RTb6MAMIRffE2OqwN1hx9vEibwY1IDSyl2jT3YdXYk9VqICNhxPZCFx+P+F1MhOXGdua73wEPT6DECYaMl+1VMr5/ir8XFEvdNaZZaxyYahjhC6VhBNB6JTnsuJbhddH02eDvvjx+mVyTa4DcbjaMlXt6+cv7vTLw8BEufxg2JttmZDQgozIcleFv0LFkGdG0J8S12R55Q+QNkTd8c4ZyoZr+Zve7SxfvL361pi+qZfX8U1ejx/bSmj3bSseombcrhrWEt56NdE43AP3JzNDJZB66c8gZRXh9hoIE2I3frotCpC5HZlHwBeNcty/SKJ8dzE7aBffjDITpOD1qrX2W+5yzpOJPbhPTPCcJJtOlZL5pmIz7DhhyJoySaZE4l4iPsces7YRq0OSpfQ9MlhPySlEmrhS4gkWe+OuOkT1/1QK+mTTqHmEqvP/ylKVlTchQDHLL2vRrpnNON1jm7U1Y0juT3FL3xDSlpnmdWavjDnJrbaeHEVPpPvIVJGoZNq66tCzMqOFxGvn6SEjZudEu2v4R9uYDrnhQVKQ99zvUm+8u/1MlKD0ID0EJ+VPw8UApHfLspjit1sUXra5YC+wbrgU2UKmhJJJuQYlO1xdXreHT5GEs1xDLNcRyDbFcw9bLNfwWK3tGaf7INfgqq6d1TXK9PRbj+hyPAdoEZ0IbVST95p03HKasMajhTejpb5/Tbuo3FQZbpPaIcyP5dXB/KiMs1/PWjJ6QU2GnpckCqCmU9zzlbpz2FffVNRjnl6qcsSlwugFMq54XSruoAncvUf06KGqFg8FLKRfevOR2D6WFcndRpXY6lmGXzjea24mkASC01f1w34cvLsxKKuRhYeDja351YKdZW/3r6+25LAqdPqUzcQU8JVKQOawoX3Ts0C2r+GEtfux1avne6QLaN+q2eoYDBuzmk4UlJ0ssicwyhrW19YgYlmt3t4R0IkhvL0xg4Iji4wpwxIOJeDARDya+lkPL4Oy0OsDnOfBDcZIQbhEd+t+8Qz8aZ9E4i8bZl2Kc/dZroJ2Uhsqgfab7jDI94Nqtmz1hqKvJ3jgdcgK0WfrOXb3pxUTzts+umTPqmkjujEkByp8t1gXzHx84o6T17taV++2uYYuhB8I+HOEVlA2kJVSQFb0B8gco6WqbWzZ1r10YzYxoZkQzI5oZj5sohEox3jrW3C+N9h5bo34p2yNd2HaJd2vrRtViS5kcaoTjb+B2o0L90e3c59hz81pZCHJZsBRZ3Lww1X1sCv4bEoO3sTHhLltzt7L9yZdk5cyRXHedu31xrb/ktW6ngd2lh4+diWPc3WfBa9BVTL78TDbPvlvZbPUUxLlEA8JXUu8P2iwPddHiq6WbOXsmeFi2jK5fmbgmrxs5WC3EcSaum2ptaBnWZhVwXPgPPx9fnb47viT4SJBSNGf78gbUDYP1/t9W1ICkeoxD9h4/Zw5EctWufl619UUSpoxippxdSae6oAtnnjFTynHQxl3GuRtqXilYNAvquoY+i8yaUAaIoWoJhry/+BUvK83odbAx3VpZMh+FUATvw8LS7cH61eTD+4szcgVZbp8YO3ZsIL2XI794/vfv95AGnF2XK7DbKbGs0FXaTnjhTd7Zf81GZPZ05oy52d6s4+yYWVhn4V7ca9iQQGUWVikwFNFuHqQorMfuUOBgDBfi6mKu7cIJg827uvzNUlOH/uqtd1HgyJ05LjBYZL4hHy5+PCGH3z970Qo4CQugFon9Z0dMzK3Zm/itPveWgsWQJ4ydwW9pqgW8b+pC/vPV1Xkgw1JumwHi3REECprho+53j8WHyMUJWi5vl+/ejfL8Hz/8UKouz/aCpaRB3YBG41cEYUr94llCLwTN5mxZyELzjc+RDUusIaPCsEQHn5fbhnjhMzL/Cz9D3aIhKtx9z1RrthToQti3z44DSO2fk1sLxt5jCKjLZAUZ7ckdDe219NHQ1F2ROp8mUm2T+iuxI+dWcevxjpQxCmedDPRuX3Py28XoMefk3YL0p8dTzt8tWpewupZhaa+L+dih3XNoRDDGolVXSC8pE9optPXxnynu26CJzR2giU0bNN+yHdCkgNL/9nggDtEXSgXW9UE22x+TroZnloNInSelNbVGx2PObfCmXEWXlrVdgJa86AQg9Xb/GTj8iKoVj5AGb3nwdgwDHLHlHfHGqkcDmlZXy7pPx3fBW8LArRnjSQwTS4JbeQce5jkTVG1O/WebWQbtrj5VXxgQ3Wk7Yf8Gr0gtVC41kNLD8oYyTk5DxLYmT9+cvTndwxA58k7AS6uvZxRPqqpnQGu6BPJKpgz0vUrN4ffPnu/tSDnr3mt1v1L9yfi5WsuXBKmP2Gk9CBMv9rYeajnEM4RsHsa434/Jvd4JGBa/UkBL/IaW7YnfavyWeczwdb5mdWmoMq0j0qq1RXmS0DznG2dPu6mG5DoLBRUJ6O/I+4szPSLavgK77O+aHY7HKJPdSB4fWlB7sgVpp/fPkI/5wPQed16/PdROcUbGZddaaXVEmyXaLNFmiTZLtFmizRJtlmizRJsl2izRZok2yyPZLIMciRneYkm+pcuTnEGytWqn9eldAuegyLmSZihCWeOQaV4fUjsL6untgQBugGO4cjmOyMUCFKTt41YfL96ZGJ7IhVyb1kFa7dbjQu+vYU7zXO9neb6vISkUM5t9N89x9f29nSRx5oWBqa8F3NFz+7qHmV4ihTMHazmdibxBHIbQn1rMy444nTbUFE24yqYmLGciZRZUTdYrwFvXWzMmTBPgbMnmHAPRiFuzGs1MdrU7Hw6VK5tru/78+KsiT3tDQZvtMTzwrxseWKfNE5d70VeRHDt0qyJ52XgHC+lkvH9G/kPnZTH7IWY/xOyHmP0Qsx+iyNvqtRZfeC2UuZQcaI9lZeUQnyalnK85mFs992nSG1mglMagzVqpnqAVlN6QAf2UXIIhRpKZ3Yozwhb4xlQiVbhcXdsdquJ0iwH1f8GXhA0vR1SVb//c134p6RhtPSkmY8RkjJiMEZMxYjJGTMaIyRgxGSMmY8TAphjYFAObYmBTDGyKgU0xsCkGNsXAphjYFAObYjJGtFmizRJtlmizRJsl2izRZok2S7RZos0SbZZos8RkjJiMEZMxvrpkjPIinQsM/cE7zF8poNepXA9vBVUOns5rgzubYmDc0CU8dgOEYeVloVuO5KqI9vTWQr4EckEN9NV/dt1T5brr1Z+bPX1XxfpX2xGOWFMwoDIm/Im5j4030lL1DShDFkpmKKvLwGAjCRUSCeWTgr8/actqWagEpuGDzVXt9H2BIfGfoUOjR6wfNd2+bwo1H5Mu4GPEqlQR3AoTcvp7wW4oB7ct7E7ARBjPBxztVXB5+8s4+RmyCaQqg+1xAk43tO8ysrosOCiWCnMV/AfKIH3JxPbvDR3IrlkqqfW0J8em1REzbWKmTcy0+XqvM+znDgJMH29oNEfOEDlD5AzfGmdw9v500b3ltGqOnCFyhsgZvlrO8Pi3vZd3++OmV0ZYguje/C4VmSt5DYouAfv9emktE4aJE95Bf68zJ1YviPwx8sfIH+MV8fGK+HhFfLwiPl4RH6+I39IV8fda1LWjyh6lsa836o9Rf4z641emPz5aocpHCmdoEfSl+9hrp7AOTX2alv1tEGpdw3rwACwe1MdnWgqobkVhlU192S22i6xXm7tmbcXQ7Pz07euztz/NLBuevT59e3b6eraz+qexkujXVEn0Aqwt2Ee7aCO2iDe03VXtyNmWn1E81L8iOt2i0hSVpqg0xZKhUbb9tao2OgEVazXGWo2xVmOs1RhrNcZajbFWY6zVGGs1xronse5JrHsS657Euiex7kmsexLrnsS6J7HuSax7Ems1Rpsl2izRZok2S7RZos0SbZZos0SbJdos0WaJNsvXWqtxaHpCGpgaOcXAiDa7aPQMRge3QlC+jFiNMsXxnG4eWLkvdyPvLtvXN6iLuU6pvu2E73yINbNiqGkMNY2hprFmVuQMkTNEzvDRnOEtGHLs9nCpEA3YcxVbGNCIBgYMW3uVVoTkVRWNsIZ4KHV6AaZQAsPMQTR2SVOXIkyTlGGZcOErBPcNbuVyuxoJjUIVK8lT3I5Mkd0kAfmyxpD2ceOezsiTI0+OPPmr5cmx2Hosth6Lrcdi639msfXg1upRSDpdUR2J6khUR77i4i6xsHLkDZE3RN7wRRVWvjNRPhZyiUwwMsHIBGP15Fg9OVZPjtWTY/XkWD15V9WTjTSUT51a2n/kNzQi6pFRj4x6ZKyi/ClVlL/k4sk+wOOLKJns57ryanazTPKPx2e/nr6ebQmSWC35G6qW/NuDqmth9FO3UGOr4yNLNdaqTrZqKYeJY3+G+VS8NUi7uK2NLFwaj6O5ylYlZqVksVyR2fnx1cnPs23zqRXLcyaWd3AqP6LJo6rGHv4a3unZ1PY40rG3QM6lMnaK3dn2jGiklQ+afLl/oGn7kVxqQyvDj7yhOZ5Cf/Af+pfLumJSvAFDU2potcmXzKyK+SSR2f5SyiUHdvCD2Ods7t/GRF6Y/TW7ZvuDb9tDHvLz1ZtfyfPJAflwXBi5YJxb9KLbN5HWqOf6pYtOKYwsizJSYxSbFwaaxdfWR8hzri6Q7Tw/2NeQYL1FPbENf6PVJ7B5HD4xNisY178wLr+wt/01HiRIj71e2dnt6660kGJcrnZVaaA0b4NwrXQwmYHl4poIgGCSIQ6Y5X4jopi+Rhe7i/nRCQiqmNTeR7JgAsZLRZmoTGjhJIJlp0FD9W+fkLfSVOSIZl8is0yKmvXnDBqZg3DhFZbVpIVI0RXmnsAPA0+1K4sJt9Qu2ojMAo7CJyahgTMB04OZMwML5xfwNTvdTOWiejrsbW0UgJk65XLm6mqGNppBs8VscpjtIGu4YDxlYokzaCYNt3pa5yrENqeEy8RVHXQ0oMCKPhDGewYVZEzDhLwvkRRei89bQgi6tqUTzp1Ax4heP1CHQqF+ZZvPtVas7TY5UfQGBPlZFho6HpQdeddS4OwG1GaqQd2wBFp1DDqdfTqsG0T8oAk5l9oQuVgwq1HI2xGZ06XHCO6uvNZvEbYjUGvU3NLT6+19ZobtdzMl/7SyffZaFWozs4qi+5P8SgXMdgwHIrQXktAzDIsjz53Ot5PB3mwfnKvLZG9sJLttChiRuSw43FCVjoiSNEXi8vrtmu4q8k4X82lgB034mh1dABdMaTN22iEIw8yGzIHLNaGef5XsSKqSl/WyMl3Mxz3sTDOx5FC9xvIqK7w+gplNyAkVVqhRsuDUjAimto7IgkupLNplhminVppt7fKihxgBTWnXqz2UXQO4J3ZAML5L1bBBapUAcOTYFsIHfz8idRbQNBUwqx+E8cnAla6BP626QZIVJNdWIbWMxWpoVr1wB1+80ld3Q8oNvB0Oo/Swf7+i7foAnOqCGWgQzW4ZUgOWo2Ewj/qjZ1F564FyRNii1P2a/CrwMqdwI8SWPF4p+gfjI+Kcb7i54dZUzuuZgFuMxf035RlVZua2GuFUpBlV11YAUUHORMqo2DmtZExMqQLa2XyNji4CV2y5Arv54AZczayU3TD0SHjmVNgdUztxqbRYNNpRV9eGGkB8nF2+Gx8dvHgxPgxeVvuuEJ+MiPbWX1BV2pv45Nipt0IaMjuhnC2kEozOJuRfzgU931SzYvpOF/T7Xybk2I3e3O1Ifn9pRyIcdw88oYKmFG908uDfPf6fNKfCDYcFJOgVvfOByzUzf4CyZGUfu6bCSHGPW3rnVHY4RGWHPfp/wsxmRIxcCySRG8Y5XcKEXGbo/LFCVFgbqHwJEuP0YLb73XM0BNdRD1x2t1hNgCN8upgXaj4iAthyNZdqJaVTglJmP5yYewE+DDR+H1k7VjUhl/6Tc8qUkvix+tfvpjNkVPiOEojWbCtVu2Fah9ADvqYbXUUgoL+SNpBSfx9eeYaqi7NPLCqIBf6vRtrPhkjgWb/jo7Hca9R/P2bRj5yT3uqnAW0PJQPnYUNmqqUyVqn058vUlMfOTJCfClBCg1N7Mio25EcFIlkRA0oxIxUDXck53/dTgfcJ3ElCTncLfhhICUJnIaeG3YATKlii5WTFxF9jpb3o6DkIbnb0nQOvZfMUmKCkO3jY8a97/d2nv26MJQgFS1ay/c88bQivReKwEvgnBdSQV4qhfst0xxny06tuEEmQye2x73/pGVsRn4XLyHzsFIxUZvaTlqeEeDNqwgStteSvlDk5nHWnjURE1lLxdM18m1XiqEL+UwjvU+WQklyxBMjTk/fne/46EssmxTVJcIeiAaCk1uO5PxCo4hW2cqbyyWfybkN3ybPZ3udqR0bgzplLZc0i8w+WOxxaNavMKpuQq/K0XdXNJId2S5LeAK29mfjIpdpbsKpdbUjlFgcxWbNrloOVM1ItnVP+vIJj+0Xq3jq3UbuGQNvJNOhdch7DhY9VVGYHGaaUu5MRmFobs+sQ6+9vTv316fnF6cnx1enrEDSmzOY7Tcpn296DeaGZAK2xfUQES67dX7i+G+9yR2y4DUqF3fpzIDrnzLioCbTaR4RTHfxxF9VRqq+a4NzqGKcVvrkjpa4fm8M4/HfPlHNQWopR1fyddp6AHTpKl+wGRBeQRvOnQYKvwCX3K7lDqDKWphy6YDXbPw0u9w5PklaiYByykegtg+rEuDZO+wvNrArlXmVl6CZjicMPtfvhOz1qvHs3mLJmI7tt1Rv0TT1SALtw0ljhbxSSewNyduniLxbtmZdNPQ4r7KrO/P+M+arucUTZ9mm06J93RJQxvvFkedwJjX8oG3VfuZOw/UfbRJ01iTqTgaj9+MnuYka0XJhp6jEqW+cmnb4eMg+xo+UwIkOZHm1khlUgEwUpXrWtXBSXc/XJRRnc29D5duUp/7ioOqecbjFyK8ZtfQtxW//rfwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The order details.
 */
@Model
public class Order {

    // Required default constructor
    public Order() {}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Order createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the order.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Order id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The intent to either capture payment immediately or authorize a payment for an order after order creation.
	*/
	@SerializedName("intent")
	private String intent;

	public String intent() { return intent; }
	
	public Order intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links). To complete payer approval, use the `approve` link with the `GET` method.
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Order links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The customer who approves and pays for the order. The customer is also known as the payer.
	*/
	@SerializedName("payer")
	private Customer payer;

	public Customer payer() { return payer; }
	
	public Order payer(Customer payer) {
	    this.payer = payer;
	    return this;
	}

	/**
	* An array of purchase units. Each purchase unit establishes a contract between a customer and merchant. Each purchase unit represents either a full or partial order that the customer intends to purchase from the merchant.
	*/
	@SerializedName(value = "purchase_units", listClass = PurchaseUnit.class)
	private List<PurchaseUnit> purchaseUnits;

	public List<PurchaseUnit> purchaseUnits() { return purchaseUnits; }
	
	public Order purchaseUnits(List<PurchaseUnit> purchaseUnits) {
	    this.purchaseUnits = purchaseUnits;
	    return this;
	}

	/**
	* The order status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Order status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Order updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
